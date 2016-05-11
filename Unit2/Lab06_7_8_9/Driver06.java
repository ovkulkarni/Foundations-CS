//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver06
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Square Turtles");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      
      Turtle.setCrawl(true);     //a class method
   
      SquareTurtle smidge = new SquareTurtle();
      smidge.setColor(Color.BLUE);
      smidge.setThickness(6);
      smidge.drawShape();
      smidge.setSize(100);
      smidge.setColor(Color.RED);
      smidge.setThickness(25);
      smidge.drawShape();
      SquareTurtle a = new SquareTurtle(400,350,10,150);
      a.setColor(Color.YELLOW);
      a.setThickness(50);
      a.drawShape();
      SquareTurtle b = new SquareTurtle(50,100,30);
      b.setThickness(15);
      b.drawShape();
      
   }
}