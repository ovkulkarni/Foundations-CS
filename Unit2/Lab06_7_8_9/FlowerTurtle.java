//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.*;
public class FlowerTurtle extends Turtle
{
   private int mySize;
   private Color myColor;
   public FlowerTurtle()
   {
      mySize = 50;
      myColor = Color.RED;
   }
   public FlowerTurtle(int x, int n, Color c)
   {
      super(x, 300, 270);
      mySize = n;
      myColor = c;
   }
   public void setSize(int n)
   {
      mySize = n;
   }
   public void setColor(Color c)
   {
      myColor = c;
   }
   private void drawPetals() //starts and ends at center facing north
   {
   
      super.setColor(myColor);
      forward(mySize);
      turnLeft(180);
      for(int k = 1; k <= 30; k++){
         turnLeft(12);
         forward(mySize);
         back(mySize);
      }
    
   
   }
   private void drawStem() //starts at top of stem facing south, ends at bottom
   {
      super.setColor(Color.GREEN);
      int part = mySize/2;
      forward(mySize);
      turnLeft(135);
      forward(mySize);
      back(mySize);
      turnLeft(90);
      forward(part);
      back(part);
      turnLeft(135);
      forward(part);
      back(mySize);
      back(part);
      turnLeft(180);
      
   
   }
   public void drawShape()
   {
      drawStem();
      drawPetals();
   }
}