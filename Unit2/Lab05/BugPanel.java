    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class BugPanel extends JPanel
{
   private BufferedImage myImage;
   final int N = 400;
   public BugPanel()
   {
      myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
      Graphics buffer = myImage.getGraphics();
      buffer.setColor(Color.BLUE);
      buffer.fillRect(0, 0, N, N);
      Bug a = new Bug(0, 0);
      Bug b = new Bug(400, 0);
      Bug c = new Bug(400, 400);
      Bug d = new Bug(0, 400);
      buffer.setColor(Color.YELLOW);
      buffer.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
      buffer.drawLine(b.getX(), b.getY(), c.getX(), c.getY());
      buffer.drawLine(c.getX(), c.getY(), d.getX(), d.getY());
      buffer.drawLine(d.getX(), d.getY(), a.getX(), a.getY());
      while (!a.sameSpot(d))
      {
         a.walkTowards(b, 0.10);
         b.walkTowards(c, 0.10);
         c.walkTowards(d, 0.10);
         d.walkTowards(a, 0.10);
         buffer.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
         buffer.drawLine(b.getX(), b.getY(), c.getX(), c.getY());
         buffer.drawLine(c.getX(), c.getY(), d.getX(), d.getY());
         buffer.drawLine(d.getX(), d.getY(), a.getX(), a.getY());
      }
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
}