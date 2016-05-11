import java.awt.*;
import javax.swing.*;
import java.text.*;

public class Scoreboard12
  extends JPanel
{
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private int wins;
  private int total;
  private int streak;
  private int max;
  
  public Scoreboard12()
  {
    setLayout(new FlowLayout());
    
    wins = (total = streak = max = 0);
    
    add(new JLabel("Wins:"));
    label1 = new JLabel();
    label1.setText("0/0 (-.--%)");
    add(label1);
    
    add(new JLabel("  Current Streak:"));
    label2 = new JLabel();
    label2.setText("0");
    add(label2);
    
    add(new JLabel("  Longest Streak:"));
    label3 = new JLabel();
    label3.setText("0");
    add(label3);
  }
  
  public void displayWinner()
  {
    total += 1;
    wins += 1;
    streak += 1;
    if (streak > max) {
      max = streak;
    }
    String s = new DecimalFormat("0.00%").format(1.0D * wins / total);
    label1.setText("" + wins + "/" + total + " (" + s + ")");
    label2.setText("" + streak);
    label3.setText("" + max);
  }
  
  public void displayLoser()
  {
    total += 1;
    streak = 0;
    String s = new DecimalFormat("0.00%").format(1.0D * wins / total);
    label1.setText("" + wins + "/" + total + " (" + s + ")");
    label2.setText("" + streak);
  }
}
