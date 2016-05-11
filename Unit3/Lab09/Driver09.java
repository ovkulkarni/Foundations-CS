import javax.swing.JFrame;

public class Driver09
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Subway Tokens");
    frame.setSize(250, 150);
    frame.setLocation(200, 100);
    frame.setDefaultCloseOperation(3);
    frame.setContentPane(new Panel09());
    frame.setVisible(true);
  }
}