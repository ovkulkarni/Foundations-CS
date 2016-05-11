//Omkar Kulkarni
import edu.fcps.Turtle;
import java.awt.*;
import javax.swing.*;
public class Driver09
{

   public static void twisties(Turtle arg)
   {
      arg.setPenDown(false);
      arg.turnRight((int)(Math.random() * 360));
      arg.forward((int)(Math.random() * 200));
      arg.setPenDown(true);
      arg.drawShape();
   }
   public static void main(String[] args){
      JFrame frame = new JFrame("Lab08");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.setCrawl(true);
      Turtle.clear(Color.WHITE);
      twisties(new TwistyTurtle1());
      twisties(new TwistyTurtle2());
      twisties(new TwistyTurtle3());
   }
}