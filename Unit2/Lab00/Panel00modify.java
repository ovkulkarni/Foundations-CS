import javax.swing.*;
import java.awt.*;
public class Panel00modify extends JPanel{
   public void paintComponent(Graphics g){
      g.setColor(Color.BLACK);
      g.fillRect(0,0,1200,900);
      g.setColor(Color.GRAY.darker());
      int xPoints1[] = {350,400,450};
      int yPoints1[] = {300,50,300};
      g.fillPolygon(xPoints1,yPoints1,3);
      int xPoints2[] = {350,450, 425,375};
      int yPoints2[] = {300,300,350,350};
      g.fillPolygon(xPoints2,yPoints2,4);
      g.setColor(Color.GREEN.brighter());
      g.setFont(new Font("Garamond Classico SC", Font.BOLD, 100));
      g.drawString("ARROW", 225, 225);
      g.setColor(Color.RED);
      g.fillOval(700,450,200,200);
      g.setColor(Color.YELLOW);
      g.fillOval(710,460,180,180);
      g.setColor(Color.BLACK);
      g.fillOval(720,470,160,160);
      g.setColor(Color.YELLOW);
      int fPoints[] = {900,780,800,760,770,710,820,810,860,840};
      int fPoints2[] = {450,550,550,600,600,675,600,600,525,525};
            g.fillPolygon(fPoints,fPoints2,10);
   //       g.drawString("Is this extra credit?", 100, 300);
   //       g.setFont(new Font("Monospaced", Font.ITALIC, 25));
   //       g.drawString("I'm doing this lab too early.", 300,50);
   //       g.drawString("THIS IS COMPSCI WITH MRS.KIM!!", 300,250);
   }
}