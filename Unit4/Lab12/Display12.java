	//Name______________________________ Date_____________
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   public class Display12
  extends JPanel
{
  private JButton[] button;
  
  public Display12(ActionListener lis)
  {
    setLayout(new GridLayout(5, 5, 5, 5));
    
    button = new JButton[25];
    for (int x = 0; x < 25; x++)
    {
      button[x] = new JButton("" + (x + 1));
      button[x].addActionListener(lis);
      button[x].setHorizontalAlignment(0);
      button[x].setFont(new Font("Serif", 1, 20));
      button[x].setBackground(Color.YELLOW);
      add(button[x]);
    }
  }
  
  public void reset()
  {
    for (int x = 0; x < 25; x++)
    {
      button[x].setText("" + (x + 1));
      button[x].setEnabled(true);
      button[x].setBackground(Color.YELLOW);
    }
  }
  
  public void displayWinner(int target)
  {
    button[(target - 1)].setBackground(Color.GREEN);
    for (int x = 0; x < 25; x++) {
      button[x].setEnabled(false);
    }
  }
  
  public void displayLoser(int target)
  {
    for (int x = 0; x < 25; x++)
    {
      button[x].setEnabled(false);
      if (x + 1 != target)
      {
        button[x].setText("");
        button[x].setBackground(Color.RED);
      }
      else
      {
        button[x].setBackground(Color.BLACK);
      }
    }
  }
  
  public void displayTooHigh(int guess)
  {
    for (int x = guess - 1; x < 25; x++)
    {
      button[x].setEnabled(false);
      button[x].setBackground(Color.RED);
      button[x].setText("");
    }
  }
  
  public void displayTooLow(int guess)
  {
    for (int x = 0; x < guess; x++)
    {
      button[x].setEnabled(false);
      button[x].setBackground(Color.RED);
      button[x].setText("");
    }
  }
}
