	//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Shifter extends Athlete implements Runnable, Workable
{
   private int myBeepers;
   private int pilesDone;
   public Shifter(int y)
   {
      super(1, y, Display.EAST, 0);
      
   }
   public void run()
   {
      myBeepers=0;
      workCorner();
            
   
   }
   public void workCorner()
   {
      myBeepers=0;
      for(int k=1;k<=6;k++)
      {
         move();      
      }
      turnAround();
      while(frontIsClear())
      {
         move();
         if(nextToABeeper())
         {
            while(nextToABeeper())
            {
               pickBeeper();
               myBeepers++;
            }
            turnAround();
            move();
            while(myBeepers!=0)
            {
               putBeeper();
               myBeepers = myBeepers - 1;
            }
            turnAround();
            move();
         }
      }
         
         
      
   }
      
   
   public void turnToTheNorth()
   {
      while(!facingNorth())
      {
         turnLeft();
      }
   }
   public void turnToTheRight()
   {
      turnLeft();
      turnLeft();
      turnLeft();
   }
   public void moveOneBlock()
   {
      move();
   }
}