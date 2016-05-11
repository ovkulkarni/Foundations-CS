import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
   
public class Lab09
{
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(18, 16);
      Display.setSpeed(10);
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;
      int f = 0;
      int g = 0;
   
      Athlete lab9 = new Athlete(1,1,Display.EAST,0);
   
      
      
      while(lab9.nextToABeeper())
      {
         lab9.pickBeeper();
         a++;
      }
      
      
      lab9.move();
      
      
      while(lab9.nextToABeeper())
      {
         lab9.pickBeeper();
         b++;
      }
      while(a>0)
      {
         lab9.putBeeper();
         a=a-1;
      }
      
      lab9.move();
      
      
      while(lab9.nextToABeeper())
      {
         lab9.pickBeeper();
         c++;
      }
      while(b>0)
      {
         lab9.putBeeper();
         b=b-1;
      }
      
      lab9.move();
      
      
      while(lab9.nextToABeeper())
      {
         lab9.pickBeeper();
         d++;
      }
      while(c>0)
      {
         lab9.putBeeper();
         c=c-1;
      }
      
      lab9.move();
      while(lab9.nextToABeeper())
      {
         lab9.pickBeeper();
         e++;
      }
      while(d>0)
      {
         lab9.putBeeper();
         d=d-1;
      }
      
      lab9.move();
      while(lab9.nextToABeeper())
      {
         lab9.pickBeeper();
         f++;
      }
      while(e>0)
      {
         lab9.putBeeper();
         e=e-1;
      }
      
      lab9.move();
      while(lab9.nextToABeeper())
      {
         lab9.pickBeeper();
         g++;
      }
      while(f>0)
      {
         lab9.putBeeper();
         f=f-1;
      }
      
      lab9.move();
      while(g>0)
      {
         lab9.putBeeper();
         g=g-1;
      }
      
      lab9.turnAround();
      while(lab9.frontIsClear())
         lab9.move();
   }
}