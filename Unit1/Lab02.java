import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02
{

   public static void main(String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(8,8);
      Display.setSpeed(5);
      Athlete me = new Athlete();
      
      me.putAndMove();
      me.turnRight();
      me.putAndMove();
      me.turnRight();
      me.putAndMove();
      me.turnLeft();
      me.putAndMove();
      me.turnLeft();
      me.putAndMove();
      me.turnRight();
      me.putAndMove();
      me.putAndMove();
      me.turnRight();
      me.putAndMove();
      me.turnLeft();
      me.putAndMove();
      me.turnLeft();
      me.putAndMove();
      me.putAndMove();
      me.putAndMove();
      me.putAndMove();
      me.turnRight();
      me.putAndMove();
      me.putAndMove();
   }
}
      
