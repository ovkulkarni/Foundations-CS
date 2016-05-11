import edu.fcps.*;
import java.awt.*;
public class TwistyTurtle3 extends Turtle
{
   public TwistyTurtle3(){
      super(200,200,90);
   }
   public void drawShape(){
      for(int x = 20; x <= 300;x+=5){
         forward(x);
         turnRight(108);
      }
   }
}