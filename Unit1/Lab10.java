import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
   
public class Lab10
{
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete a = new Athlete();
      
      while(!a.nextToABeeper())
      {
         if(a.rightIsClear())
         {
            a.turnRight();
            a.move();
         }
         else if(a.frontIsClear())
         {
            a.move();
         }
         else
         {
            a.turnAround();
         }
      }
   }
}