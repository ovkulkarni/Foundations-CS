import java.awt.*;
import javax.swing.*;

public class Display11 extends JPanel
{
  private JLabel label;
  private int total;
  
  public Display11()
  {
    setLayout(new GridLayout(1, 1));
    total = 12;
    
    label = new JLabel(new ImageIcon("stones12.jpg"));
    label.setHorizontalAlignment(0);
    add(label);
  }
  
  public int pickUp(int x)
  {
    total -= x;
    if (total <= 0) {
      total = 12;
    }
    label.setIcon(new ImageIcon("stones" + total + ".jpg"));
    return total;
  }
}
