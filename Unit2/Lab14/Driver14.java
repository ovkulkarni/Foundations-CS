/*
  ____                     ____       _
 / ___|___  _ __ ___  _ __/ ___|  ___(_)
| |   / _ \| '_ ` _ \| '_ \___ \ / __| |
| |__| (_) | | | | | | |_) |__) | (__| |
 \____\___/|_| |_| |_| .__/____/ \___|_|
                     |_|                 
*/
import javax.swing.JFrame;

public class Driver14
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Lab14");
      frame.setSize(400, 400);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setContentPane(new BumperPanel());
      frame.setVisible(true);
   }
}