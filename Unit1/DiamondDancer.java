import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class DiamondDancer extends Dancer
{
  public DiamondDancer(int x, int y, int beep)
  {
    super(x,y,Display.NORTH,beep);
  }
  
  public void danceStep()
  {
turnLeft();
move();
turnLeft();
move();
turnAround();
move();
move();
turnAround();
move();
putBeeper();
move();
move();
turnRight();
move();
turnAround();
putBeeper();
  }
}
