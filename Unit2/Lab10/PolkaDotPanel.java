   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class PolkaDotPanel
  extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Timer t;
   private Polkadot pd;
   private Polkadot pd2;
   
   public PolkaDotPanel()
   {
      myImage = new BufferedImage(400, 400, 1);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, 400, 400);
      pd = new Polkadot();
      pd2 = new Polkadot(0, 0, 200, Color.ORANGE);
      t = new Timer(1000, new PolkaDotPanel.Listener());
      t.start();
   }
   
   public void paintComponent(Graphics g)
   {
      g.drawImage(this.myImage, 0, 0, getWidth(), getHeight(), null);
   }
   
   private class Listener
     implements ActionListener
   {
      private Listener() {}
      
      public void actionPerformed(ActionEvent e)
      {
         PolkaDotPanel.this.myBuffer.setColor(PolkaDotPanel.BACKGROUND);
         PolkaDotPanel.this.myBuffer.fillRect(0, 0, 400, 400);
         
         PolkaDotPanel.this.pd.jump(400, 400);
         PolkaDotPanel.this.pd.draw(PolkaDotPanel.this.myBuffer);
         PolkaDotPanel.this.pd2.jump(400, 400);
         PolkaDotPanel.this.pd2.draw(PolkaDotPanel.this.myBuffer);
         
         PolkaDotPanel.this.repaint();
      }
   }
}
