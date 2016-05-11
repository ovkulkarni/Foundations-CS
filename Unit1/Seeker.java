
import edu.fcps.karel2.Display;
public class Seeker extends Athlete{
   public Seeker(){
      super(1,1,Display.NORTH,0);
   }
   public void fetchBeeper(){
      while(!rightIsClear()){
         move();
      }
      turnRight();
      move();
      turnRight();
      recur();
      turnLeft();
      move();
      turnLeft();
      while(frontIsClear())
      move();
      turnAround();
   }
   public void recur(){
      if(nextToABeeper()){
         pickBeeper();
         turnAround();
      }
      else{
         move();
         recur();
         move();
      }
   }
}