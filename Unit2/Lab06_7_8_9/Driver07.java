//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;
public class Driver07
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Polygon Turtles");
      frame.setSize(800, 800);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
   
      PolygonTurtle smidge = new PolygonTurtle(100.0, 5);
      smidge.setCrawl(false);
      for(int s = 3;s<=8;s++){
      int angle = 360/s;
      smidge.setColor(Color.BLUE);
      smidge.setThickness(6);
      smidge.drawShape(s);
}
      // PolygonTurtle a = new PolygonTurtle(400,400,30,50,4);
//       a.setColor(Color.YELLOW);
//       a.setThickness(10);
//       a.drawShape();
//       PolygonTurtle b = new PolygonTurtle(300,350,15,60,5);
//       b.setThickness(17);
//       b.drawShape();
//       PolygonTurtle c =  new PolygonTurtle(300,200,10,75,6);
//       c.setColor(Color.RED);
//       c.setThickness(10);
//       c.drawShape();
//       PolygonTurtle d =  new PolygonTurtle(300,400,40,60,7);
//       d.setColor(Color.GREEN.darker());
//       d.setThickness(10);
//       d.drawShape();
//       PolygonTurtle e =  new PolygonTurtle(400,500,40,70,8);
//       e.setColor(Color.GRAY);
//       e.setThickness(10);
//       e.drawShape();
   
   }
}