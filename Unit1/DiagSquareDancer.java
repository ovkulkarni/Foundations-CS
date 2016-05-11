import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class DiagSquareDancer extends Dancer
{
  public DiagSquareDancer(int x, int y, int beep)
  {
    super(x,y,Display.NORTH,beep);
  }
  
  public void danceStep()
  {
turnRight();
move();
turnLeft();
move();
turnAround();
move();
move();
turnLeft();
move();
turnAround();
putBeeper();
  }
}