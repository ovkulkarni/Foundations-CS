import javax.swing.*;
import java.awt.*;
public class Panel01 extends JPanel{
   public void paintComponent(Graphics g){
      g.setColor(Color.CYAN);
      g.fillRect(0,0,400,400);
      g.setColor(Color.GREEN.darker());
      g.fillRect(0,350,400,50);
      g.setColor(Color.RED);
      g.fillRect(100,200,150,150);
      g.setColor(Color.WHITE);
      g.fillRect(110,210,50,50);
      g.fillRect(190,210,50,50);
      g.setColor(Color.RED);
      g.drawRect(110,210,50,50);
      g.drawRect(190,210,50,50);
      g.drawLine(110,235,160,235);
      g.drawLine(190,235,240,235);
      g.drawLine(135,210,135,260);
      g.drawLine(215,210,215,260);
      g.setColor(Color.BLACK);
      g.fillRect(150,275,50,75);
      int xPoints[] = {75,175,275};
      int yPoints[] = {200,150,200};
      g.fillPolygon(xPoints,yPoints,3);
      g.setColor(Color.YELLOW);
      g.fillOval(300,75,50,50);
      g.setColor(Color.WHITE);
      g.drawString("Welcome Home", 40, 40);
   
      for(int x = 0; x<=400; x += 25)
         g.fillRect(x,310,10,40);
      for(int c = 0; c<=400; c+=20)
         g.fillOval(c,75,25,10);
      g.setColor(Color.BLACK);
      for(int k = 50; k<=500; k+=50){
         int bird1[] = {k,k+10,k+20};
         int bird2[] = {90,100,90};
         g.drawPolyline(bird1,bird2,3);
      }
      
   }
}