//////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                  //
//          _____               ____            _______                                             //
//          |    |             /    \          |       \          111111   3333333                  //
//          |    |            /      \         |  |\    \         1    1   3      3                 //
//          |    |           /   /\   \        |  | \    \        1    1   333333  3                //
//          |    |          /   /  \   \       |  | /    /        1    1        3   3               //
//          |    |         /   /____\   \      |  |/    /         1    1        3  3                //
//          |    |        /   _______    \     |       /          1    1       3  3                 //
//          |    |        |   |      |   |     |  |\   \          1    1      3  3                  //
//          |    |        |   |      |   |     |  | \   \         1    1      3   3                 //
//          |    |        |   |      |   |     |  |  \   \        1    1       3   3                //
//          |    |        |   |      |   |     |  |  /   /        1    1        3   3               //
//          |    |_______ |   |      |   |     |  | /   /         1    1   33333   3                //
//          |           | |   |      |   |     |  |/   /          1    1   3      3                 //
//          |___________| |___|      |___|     |______/           111111   3333333                  //
//                                                                                                  //
//////////////////////////////////////////////////////////////////////////////////////////////////////

import edu.fcps.karel2.*;
public class Portal
{
   public static int startY = 1;
   public static int endY = 1;
   public static int startDir = 1;
   public static int startX = 1; 
   public static int endX = 1;  
   public static double wallDir = Math.random();
   public static void teleportUp(Teleporter arg){
      while(arg.frontIsClear())
         arg.move();
      startY = arg.getY();
      arg.explode();
      endY = startY+1;
      startDir = arg.getDirection();
      startX = arg.getX();
   }
   public static void teleportDown(Teleporter arg){
      while(arg.frontIsClear())
         arg.move();
      startY = arg.getY();
      arg.explode();
      endY = startY-1;
      startDir = arg.getDirection();
      startX = arg.getX();
   }
   public static void teleportRight(Teleporter arg){
      while(arg.frontIsClear())
         arg.move();
      startX = arg.getX();
      arg.explode();
      endX = startX+1;
      startDir = arg.getDirection();
      startY = arg.getY();
   }
   
   public static void teleportLeft(Teleporter arg){
      while(arg.frontIsClear())
         arg.move();
      startX = arg.getX();
      arg.explode();
      endX = startX-1;
      startDir = arg.getDirection();
      startY = arg.getY();
   }
   
   public static void upRightTurn(Teleporter arg){
      while(arg.frontIsClear())
         arg.move();
      arg.turnRight();
      arg.move();
      arg.turnRight();
   }
   public static void downLeftTurn(Teleporter arg){
      while(arg.frontIsClear())
         arg.move();
      arg.turnLeft();
      arg.move();
      arg.turnLeft();
   }
   public static void horizWall(){
            int y1 = (int)(Math.random() * 6 + 1);
      int y2 = (int)(Math.random() * 6 + 1);
      int y3 = (int)(Math.random() * 6 + 1);
      int y4 = (int)(Math.random() * 6 + 1);
      int y5 = (int)(Math.random() * 6 + 1);
      int y6 = (int)(Math.random() * 6 + 1);
      int y7 = (int)(Math.random() * 6 + 1);
      int y8 = (int)(Math.random() * 6 + 1); 
      WorldBackend.getCurrent().addWall(new Wall(1, y1, 1, Display.HORIZONTAL));
      WorldBackend.getCurrent().addWall(new Wall(2, y2, 1, Display.HORIZONTAL));
      WorldBackend.getCurrent().addWall(new Wall(3, y3, 1, Display.HORIZONTAL));
      WorldBackend.getCurrent().addWall(new Wall(4, y4, 1, Display.HORIZONTAL));
      WorldBackend.getCurrent().addWall(new Wall(5, y5, 1, Display.HORIZONTAL));
      WorldBackend.getCurrent().addWall(new Wall(6, y6, 1, Display.HORIZONTAL));
      WorldBackend.getCurrent().addWall(new Wall(7, y7, 1, Display.HORIZONTAL));
      WorldBackend.getCurrent().addWall(new Wall(8, y8, 1, Display.HORIZONTAL));
   }
   public static void vertWall(){
         int y1 = (int)(Math.random() * 6 + 1);
      int y2 = (int)(Math.random() * 6 + 1);
      int y3 = (int)(Math.random() * 6 + 1);
      int y4 = (int)(Math.random() * 6 + 1);
      int y5 = (int)(Math.random() * 6 + 1);
      int y6 = (int)(Math.random() * 6 + 1);
      int y7 = (int)(Math.random() * 6 + 1);
      int y8 = (int)(Math.random() * 6 + 1); 
      WorldBackend.getCurrent().addWall(new Wall(y1, 1, 1, Display.VERTICAL));
      WorldBackend.getCurrent().addWall(new Wall(y2, 2, 1, Display.VERTICAL));
      WorldBackend.getCurrent().addWall(new Wall(y3, 3, 1, Display.VERTICAL));
      WorldBackend.getCurrent().addWall(new Wall(y4, 4, 1, Display.VERTICAL));
      WorldBackend.getCurrent().addWall(new Wall(y5, 5, 1, Display.VERTICAL));
      WorldBackend.getCurrent().addWall(new Wall(y6, 6, 1, Display.VERTICAL));
      WorldBackend.getCurrent().addWall(new Wall(y7, 7, 1, Display.VERTICAL));
      WorldBackend.getCurrent().addWall(new Wall(y8, 8, 1, Display.VERTICAL));
   }
   public static void randomMap(){
      Display.openWorld("maps/portal.map");
      Display.setSize(8, 8);
      Display.setSpeed(5);
   

      if(wallDir <= 0.5){           
         horizWall();
      }
      else{
      vertWall();
      }
      
   
   }
   public static void teleportUpDown(){
      Teleporter a = new Teleporter();
      teleportUp(a);
      Teleporter b = new Teleporter(startX, endY, startDir);
      upRightTurn(b);
      teleportDown(b);
      Teleporter c = new Teleporter(startX, endY, startDir);
      downLeftTurn(c);
      teleportUp(c);
      Teleporter d = new Teleporter(startX, endY, startDir);
      upRightTurn(d);
      teleportDown(d);
      Teleporter e = new Teleporter(startX, endY, startDir);
      downLeftTurn(e);
      teleportUp(e);
      Teleporter f = new Teleporter(startX, endY, startDir);
      upRightTurn(f);
      teleportDown(f);
      Teleporter g = new Teleporter(startX, endY, startDir);
      downLeftTurn(g);
      teleportUp(g);
      Teleporter h = new Teleporter(startX, endY, startDir);
      upRightTurn(h);
      teleportDown(h);
      Teleporter i = new Teleporter(startX, endY, startDir);
      while(i.frontIsClear()){
         i.move();
      }
   }
   public static void teleportRightLeft(){
      Teleporter a = new Teleporter(1, 8, Display.EAST);
      teleportRight(a);
      Teleporter b = new Teleporter(endX, startY, startDir);
      upRightTurn(b);
      teleportLeft(b);
      Teleporter c = new Teleporter(endX, startY, startDir);
      downLeftTurn(c);
      teleportRight(c);
      Teleporter d = new Teleporter(endX, startY, startDir);
      upRightTurn(d);
      teleportLeft(d);
      Teleporter e = new Teleporter(endX, startY, startDir);
      downLeftTurn(e);
      teleportRight(e);
      Teleporter f = new Teleporter(endX, startY, startDir);
      upRightTurn(f);
      teleportLeft(f);
      Teleporter g = new Teleporter(endX, startY, startDir);
      downLeftTurn(g);
      teleportRight(g);
      Teleporter h = new Teleporter(endX, startY, startDir);
      upRightTurn(h);
      teleportLeft(h);
      Teleporter i = new Teleporter(endX, startY, startDir);
      while(i.frontIsClear()){
         i.move();
      }
   }
   
   public static void main(String[] args)
   {
      randomMap();
      if(wallDir<=0.5)
         teleportUpDown();
      
      else
         teleportRightLeft();
          
   }
}