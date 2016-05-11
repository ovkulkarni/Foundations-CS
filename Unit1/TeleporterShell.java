import edu.fcps.karel2.*;
public abstract class TeleporterShell extends Athlete{
   public TeleporterShell(int x, int y, int dir){
      super(x,y,dir,Display.INFINITY);
   }
   public TeleporterShell(){
      super();
   }
   public static int startY = 1;
   public static int endY = 1;
   public static int startDir = 1;
   public static int startX = 1; 
   public static int endX = 1;  
   public void rightTurn(){
    //////////////////////////////////                            
    //                              //
    //        INSERT CODE HERE      //
    //                              //
    //////////////////////////////////
   }
   public void leftTurn(){
    //////////////////////////////////                            
    //                              //
    //        INSERT CODE HERE      //
    //                              //
    //////////////////////////////////
   }
   public abstract void teleportAdd();
   public abstract void teleportSub();
}
