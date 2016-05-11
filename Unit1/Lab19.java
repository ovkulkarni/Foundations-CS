import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab19
{
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Dorothy a = new Dorothy();
      while (a.findPath()) {
         a.followPath();
      }
      a.turnAround();
      a.move();
      a.turnRight();
   }
}
