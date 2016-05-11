import edu.fcps.karel2.*;
public class TeleporterLRShell extends Teleporter
{
   public TeleporterLRShell(int x, int y, int dir){
      super(x,y,dir);
   }
   public static int startY = 1;
   public static int endY = 1;
   public static int startDir = 1;
   public static int startX = 1; 
   public static int endX = 1;  
   public static double wallDir = Math.random();
   public void teleportAdd(){
    //////////////////////////////////                            
    //                              //
    //        INSERT CODE HERE      //
    //                              //
    //////////////////////////////////
      
   }
   
   public void teleportSub(){
    //////////////////////////////////                            
    //                              //
    //        INSERT CODE HERE      //
    //                              //
    //////////////////////////////////
      
   }
   
   


   public static void teleportRightLeft(){
      TeleporterLR a = new TeleporterLR(1,8,Display.EAST);
      a.teleportAdd();
      TeleporterLR b = new TeleporterLR(endX, startY, startDir);
      b.rightTurn();
      b.teleportSub();
      TeleporterLR c = new TeleporterLR(endX, startY, startDir);
      c.leftTurn();
      c.teleportAdd();
      TeleporterLR d = new TeleporterLR(endX, startY, startDir);
      d.rightTurn();
      d.teleportSub();
      TeleporterLR e = new TeleporterLR(endX, startY, startDir);
      e.leftTurn();
      e.teleportAdd();
      TeleporterLR f = new TeleporterLR(endX, startY, startDir);
      f.rightTurn();
      f.teleportSub();
      TeleporterLR g = new TeleporterLR(endX, startY, startDir);
      g.leftTurn();
      g.teleportAdd();
      TeleporterLR h = new TeleporterLR(endX, startY, startDir);
      h.rightTurn();
      h.teleportSub();
      TeleporterLR i = new TeleporterLR(endX, startY, startDir);
      while(i.frontIsClear()){
         i.putBeeper();
         i.move();
      }
      i.putBeeper();
      i.explode();
   }
}