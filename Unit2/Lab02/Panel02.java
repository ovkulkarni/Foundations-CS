import java.awt.*;
import javax.swing.*;

public class Panel02
  extends JPanel
{
  public void paintComponent(Graphics g)
  {
    g.setColor(Color.RED.darker());
    g.fillRect(0, 0, 400, 400);
    
    g.setColor(Color.YELLOW.darker());
    g.fillRect(120, 60, 140, 180);
    for (int x = 110; x <= 250; x += 20) {
      g.fillOval(x, 50, 20, 20);
    }
    for (int x = 110; x <= 250; x += 20) {
      g.fillOval(x, 230, 20, 20);
    }
    for (int y = 50; y <= 230; y += 20) {
      g.fillOval(110, y, 20, 20);
    }
    for (int y = 50; y <= 230; y += 20) {
      g.fillOval(250, y, 20, 20);
    }
    ImageIcon i = new ImageIcon("tj.jpg");
    g.drawImage(i.getImage(), 135, 75, 110, 150, null);
    g.setFont(new Font(null, 3, 35));
    g.setColor(Color.WHITE);
    g.drawString("Our Fearless Leader", 10, 300);
  }
}