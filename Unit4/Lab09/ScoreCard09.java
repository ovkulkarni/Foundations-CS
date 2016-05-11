import java.awt.*;
import javax.swing.*;

public class ScoreCard09 extends JPanel
{
  private JTextField[] input;
  
  public ScoreCard09()
  {
    setLayout(new GridLayout(2, 18));
    for (int i = 1; i <= 18; i++) {
      add(new JLabel("" + i, 0));
    }
    input = new JTextField[18];
    for (int j = 0; j < input.length; j++)
    {
      input[j] = new JTextField();
      add(input[j]);
    }
  }
  
  public void randomize()
  {
    for (int i = 0; i < input.length; i++) {
      input[i].setText("" + (int)(Math.random() * 4.0 + 1.0));
    }
  }
  
  public int findTotal()
  {
    int i = 0;
    for (int j = 0; j < input.length; j++) {
      i += Integer.parseInt(input[j].getText());
    }
    return i;
  }
  
  public int findAces()
  {
    int i = 0;
    for (int j = 0; j < input.length; j++) {
      if (Integer.parseInt(input[j].getText()) == 1) {
        i += 1;
      }
    }
    return i;
  }
  
  public int findHardestHole()
  {
    int i = 0;
    int j = Integer.parseInt(input[0].getText());
    for (int k = 1; k < input.length; k++) {
      if (Integer.parseInt(input[k].getText()) > j)
      {
        i = k;
        j = Integer.parseInt(input[k].getText());
      }
    }
    return i + 1;
  }
}
