import java.awt.*;
import javax.swing.*;

public class Scoreboard11 extends JPanel
{
  private JLabel label1;
  private JLabel label2;
  private int one;
  private int two;
  private int current;
  
  public Scoreboard11()
  {
    setLayout(new GridLayout(1, 3));
    one = (two = 0);
    current = 1;
    
    label1 = new JLabel("One: 0");
    label1.setHorizontalAlignment(0);
    label1.setOpaque(true);
    label1.setBackground(Color.yellow);
    add(label1);
    
    JLabel label = new JLabel("Nim");
    label.setHorizontalAlignment(0);
    label.setFont(new Font("Serif", 1, 20));
    add(label);
    
    label2 = new JLabel("Two: 0");
    label2.setHorizontalAlignment(0);
    label2.setOpaque(true);
    add(label2);
  }
  
  private void win()
  {
    if (current == 1)
    {
      one += 1;
      label1.setText("One: " + one);
    }
    else
    {
      two += 1;
      label2.setText("Two: " + two);
    }
  }
  
  private void changeColor()
  {
    if (current == 1)
    {
      current = 2;
      label1.setBackground(new Color(204, 204, 204));
      label2.setBackground(Color.yellow);
    }
    else
    {
      current = 1;
      label2.setBackground(new Color(204, 204, 204));
      label1.setBackground(Color.yellow);
    }
  }
  
  public void update(boolean arg)
  {
    if (arg) {
      win();
    } else {
      changeColor();
    }
  }
}
