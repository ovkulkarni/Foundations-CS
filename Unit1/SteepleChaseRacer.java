//Name:Omkar Kulkarni Date:9-17-15
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class SteepleChaseRacer extends Racer
{
   public SteepleChaseRacer(int y)
   {
      super(y);
   }
   public void jumpRight()
   {
      int n = 0;
      turnLeft();
      while(!rightIsClear())
      {
      move();
      n++;
      }
      turnRight();
      move();
      turnRight();
      for(int k=1; k <=n; k++)
      {
      move();
      }
      turnLeft();
   }
   public void jumpLeft()
   {
      turnRight();
      move();
      move();
      move();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      move();
      move();
      move();
      turnRight();
   }
   public void sprint(int n)
   {
      for(int k=1; k<= n; k++)
         move();
   }
   public void put(int n)
   {
      for(int k=1; k<=n; k++)
         putBeeper();
   }
   public void pick(int n)
   {
      for(int k=1; k<=n; k++)
         pickBeeper();
   }
   public void shuttle(int spaces, int beepers)
   {
      move();
      jumpRight();
      sprint(spaces);
      pick(beepers);
      turnAround();
      sprint(spaces);
      jumpLeft();
      move();
      put(beepers);
      turnAround();
   }

}
