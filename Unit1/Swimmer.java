	//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Swimmer extends Robot implements Runnable
{
   public Swimmer(int x)
   {
      super(x, 1, Display.NORTH, Display.INFINITY);
   }
   public void run() //not swim
   {
      for(int laps=1;laps<=10;laps++)
      {
         for(int cross=1;cross<=8;cross++)
         {
            move();
         }
         turnLeft();
         turnLeft();
         for(int goBack=1;goBack<=8;goBack++)
         {
            move();
         }
         turnLeft();
         turnLeft();
      }
   }
}