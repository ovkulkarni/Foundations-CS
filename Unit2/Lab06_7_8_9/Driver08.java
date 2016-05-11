import edu.fcps.Turtle;
import java.awt.*;
import javax.swing.*;

public class Driver08
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Lab08");
    frame.setSize(400, 400);
    frame.setLocation(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new TurtlePanel());
    frame.setVisible(true);
    
    Turtle.setCrawl(false);
    Turtle.clear(Color.WHITE);
    FlowerTurtle a = new FlowerTurtle(60, 50, Color.RED);
    FlowerTurtle b = new FlowerTurtle(175, 50, Color.YELLOW);
    FlowerTurtle c = new FlowerTurtle(290, 50, Color.BLACK);
    FlowerTurtle d = new FlowerTurtle(425, 50, Color.BLUE);
    a.drawShape();
    b.drawShape();
    c.drawShape();
    d.drawShape();
  }
}
