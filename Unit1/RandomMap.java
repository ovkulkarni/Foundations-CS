import edu.fcps.karel2.*;
public class RandomMap{
   public static double wallDir = Math.random();
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
}
