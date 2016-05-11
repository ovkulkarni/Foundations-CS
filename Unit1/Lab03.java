import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03
{

   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(10);
      Climber me = new Climber(8);
      Climber you = new Climber(8);
     
      me.putBeeper();
      me.turnRight();
      you.turnRight();
      me.move();
      you.move();
      me.climbUpRight();
      you.climbUpRight();
      me.climbUpRight();
      you.climbUpRight();
      me.climbUpRight();
      you.climbUpRight();
      me.climbDownRight();
      you.climbDownRight();
      me.climbDownRight();
      you.climbDownRight();
      me.pickBeeper();
      me.turnAround();
      you.turnAround();
      me.climbUpLeft();
      you.climbUpLeft();
      me.climbUpLeft();
      you.climbUpLeft();
      me.climbDownLeft();
      you.climbDownLeft();
      me.climbDownLeft();
      you.climbDownLeft();
      me.climbDownLeft();
      you.climbDownLeft();
      me.move();
      you.move();
      me.putBeeper();
      me.move();
      you.move();
   }
}
