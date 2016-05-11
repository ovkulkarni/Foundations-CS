import edu.fcps.karel2.Display;
public class Dorothy extends Athlete
{
   public Dorothy()
   {
      super(2,2,Display.EAST,0);
   }
   public boolean findPath()
   {
   
      move();
   
      if (nextToABeeper()) {
         return true;
      }
      turnAround();
      move();
      turnRight();
      move();
      if (nextToABeeper()) {
         return true;
      }
      turnAround();
      move();
      move();
      
      if (nextToABeeper()) {
         return true;
      }
      else{
         return false;
      }
   }
   
   public void followPath()
   {
      while (nextToABeeper()) {
      
         if(frontIsClear())
         {
            move();
         }
         else{
            break;
         }
      }
      if(frontIsClear() || !nextToABeeper())
      {
         turnAround();
         move();
         turnAround();
      }
      else{
         turnLeft();
      }
   }
}