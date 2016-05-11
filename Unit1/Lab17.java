//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab17
{
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(8, 8);
      Display.setSpeed(5);
      Thread t1 = new Thread(( new Democrat()));
      Thread t2 = new Thread(( new Republican() ));
      t1.start();
      t2.start();
   }
}
