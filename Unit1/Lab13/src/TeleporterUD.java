import edu.fcps.karel2.*;
public class TeleporterUD extends Teleporter{
   public TeleporterUD(int x, int y, int dir){
      super(x,y,dir);
   }
   public void teleportAdd(){
      while(frontIsClear()){
         putBeeper();
         move();
      }
      putBeeper();
      endY = getY();
      startX = getX();
      explode();
      endY = endY+1;
      startDir = getDirection();
      
   }
   public void teleportSub(){
      while(frontIsClear()){
         putBeeper();
         move();
      }
      endY = getY();
      startX = getX();
      putBeeper();
      explode();
      endY = endY-1;
      startDir = getDirection();
      
   }
   public static void teleportUpDown(){
      TeleporterUD a = new TeleporterUD(1,1,Display.NORTH);
      a.teleportAdd();
      TeleporterUD b = new TeleporterUD(startX, endY, startDir);
      b.rightTurn();
      b.teleportSub();
      TeleporterUD c = new TeleporterUD(startX, endY, startDir);
      c.leftTurn();
      c.teleportAdd();
      TeleporterUD d = new TeleporterUD(startX, endY, startDir);
      d.rightTurn();
      d.teleportSub();
      TeleporterUD e = new TeleporterUD(startX, endY, startDir);
      e.leftTurn();
      e.teleportAdd();
      TeleporterUD f = new TeleporterUD(startX, endY, startDir);
      f.rightTurn();
      f.teleportSub();
      TeleporterUD g = new TeleporterUD(startX, endY, startDir);
      g.leftTurn();
      g.teleportAdd();
      TeleporterUD h = new TeleporterUD(startX, endY, startDir);
      h.rightTurn();
      h.teleportSub();
      TeleporterUD i = new TeleporterUD(startX, endY, startDir);
      while(i.frontIsClear()){
         i.putBeeper();
         i.move();
      }     
      i.putBeeper();
      i.explode(); 
   }
}