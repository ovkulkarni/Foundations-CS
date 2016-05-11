import javax.swing.*;
import java.awt.*;
public class Panel00 extends JPanel{
   public void paintComponent(Graphics g){
      g.setColor(Color.BLUE);
      g.fillRect(0,0,400,225);
      g.setFont(new Font("Serif", Font.BOLD, 50));
      g.setColor(Color.RED);
      g.drawString("Hello World", 100, 150);
   }
}