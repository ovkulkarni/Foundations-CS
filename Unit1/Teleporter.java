import edu.fcps.karel2.*;
public abstract class Teleporter extends Athlete{
   public Teleporter(int x, int y, int dir){
      super(x,y,dir,Display.INFINITY);
   }
   public Teleporter(){
      super();
   }
   public static int startY = 1;
   public static int endY = 1;
   public static int startDir = 1;
   public static int startX = 1; 
   public static int endX = 1;  
   public void rightTurn(){
      while(frontIsClear()){
         putBeeper();
         move();
      }
         
      turnRight();
      putBeeper();
      move();
      turnRight();
   }
   public void leftTurn(){
      while(frontIsClear()){
         putBeeper();
         move();
      }
      turnLeft();
      putBeeper();
      move();
//       putBeeper();
      turnLeft();
   }
   public abstract void teleportAdd();
   public abstract void teleportSub();
}
