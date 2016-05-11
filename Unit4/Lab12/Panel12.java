	//Name______________________________ Date_____________
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   public class Panel12
  extends JPanel
{
  private Scoreboard12 scoreboard;
  private Display12 display;
  private JLabel label;
  private JButton reset;
  private int guess;
  private int target;
  private int tries;
  
  public Panel12()
  {
    tries = 4;
    target = ((int)(Math.random() * 25.0 + 1.0));
    
    setLayout(new BorderLayout());
    
    scoreboard = new Scoreboard12();
    add(scoreboard, "North");
    
    display = new Display12(new Listener1());
    add(display, "Center");
    
    JPanel south = new JPanel();
    south.setLayout(new FlowLayout());
    add(south, "South");
    label = new JLabel("You have 4 tries to guess the number.");
    south.add(label);
    reset = new JButton("Reset");
    reset.setEnabled(false);
    reset.addActionListener(new Listener2());
    south.add(reset);
  }
  
  private class Listener1
    implements ActionListener
  {
    
    public void actionPerformed(ActionEvent e)
    {
      JButton source = (JButton)e.getSource();
      guess = Integer.parseInt(source.getText());
      tries = (tries - 1);
      if (guess == target) {
        displayWinner();
      } else if (tries == 0) {
        displayLoser();
      } else if (guess > target) {
        displayTooHigh();
      } else {
        displayTooLow();
      }
    }
  }
  
  private class Listener2
    implements ActionListener
  {
    
    public void actionPerformed(ActionEvent e)
    {
      display.reset();
      tries = 4;
      target = ((int)(Math.random() * 25.0 + 1.0));
      label.setText("You have 4 tries to guess the number.");
      reset.setEnabled(false);
    }
  }
  
  private void displayWinner()
  {
    scoreboard.displayWinner();
    display.displayWinner(target);
    label.setText("You got it!");
    reset.setEnabled(true);
  }
  
  private void displayLoser()
  {
    scoreboard.displayLoser();
    display.displayLoser(target);
    label.setText("You lose.");
    reset.setEnabled(true);
  }
  
  private void displayTooHigh()
  {
    display.displayTooHigh(guess);
    String message = "Too high -- ";
    switch (tries)
    {
    case 3: 
      message = message + "3 tries remaining.";
      break;
    case 2: 
      message = message + "only two tries left.";
      break;
    case 1: 
      message = message + "last try!";
      break;
    }
    label.setText(message);
  }
  
  private void displayTooLow()
  {
    display.displayTooLow(guess);
    String message = "Too low -- ";
    switch (tries)
    {
    case 3: 
      message = message + "3 tries remaining.";
      break;
    case 2: 
      message = message + "only two tries left.";
      break;
    case 1: 
      message = message + "last try!";
      break;
    }
    label.setText(message);
  }
}
