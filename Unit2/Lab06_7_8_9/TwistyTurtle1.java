import edu.fcps.*;
import java.awt.*;
public class TwistyTurtle1 extends Turtle
{
   public TwistyTurtle1(){
      super(200,200,90);
   }
   public void drawShape(){
      for(int x = 100; x >= 0;x-=1){
         forward(x);
         turnRight(50);
      }
   }
}