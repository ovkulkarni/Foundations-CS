//Name:        Omkar      Date: 11-24-15
import java.awt.*;
public class Ball extends Polkadot
{
   private double dx;       // pixels to move each time step() is called.
   private double dy;
    // constructors
   public Ball()         //default constructor
   {
      super(200, 200, 50, Color.BLACK);
      dx = Math.random() * 12 - 6;          // to move vertically
      dy = Math.random() * 12 - 6;          // to move sideways
   }
   public Ball(double x, double y, double dia, Color c)
   {
      super(x, y, dia, c);
      dx = Math.random()* 12 - 6;
      dy = Math.random() * 12 - 6;
   }
      
     //modifier methods 
   public void setdx(double x)        
   {
      dx = x;
   }
   public void setdy(double y)
   {
      dy = y;
   }
      
      //accessor methods
   public double getdx()             
   {
      return dx;
   }
   public double getdy()
   {
      return dy;
   }
      
     //instance methods
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX()+ dx);                  // move horizontally
      setY(getY()+ dy);
        
      if(getX() >= rightEdge - getRadius())  //hit right edge
      {
         setX(rightEdge - getRadius());
         dx = dx * -1; 
      }
      if(getY() >= bottomEdge - getRadius()){
         setY(bottomEdge - getRadius());
         dy = dy * -1;
      }
      if(getY() <= 0 + getRadius()){
         setY(getRadius());
         dy = dy * -1;
      }
      if(getX() <= 0 + getRadius()){
         setX(getRadius());
         dx = dx * -1;
      }
         
   }
}