import edu.fcps.*;
import java.awt.*;
public class TwistyTurtle2 extends Turtle
{
   public TwistyTurtle2(){
      super(200,200,90);
   }
   public void drawShape(){
      for(int x = 10; x <= 200;x+=2){
         forward(x);
         turnRight(135);
      }
   }
}