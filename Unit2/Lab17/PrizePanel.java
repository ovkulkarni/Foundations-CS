   //Name:    Date:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class PrizePanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private Timer t; 
   private int hits; 
   public int xPos;
   public int yPos;
		//constructor   
   public PrizePanel()
   {
      myImage = new BufferedImage(400, 400, 1);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, 400, 400);
      int bxPos = (int)(Math.random()*(FRAME-100)+50);
      int byPos = (int)(Math.random()*(FRAME-100)+50);
      ball = new Ball(bxPos,byPos,50,Color.BLACK);
      pd = new Polkadot();
      t = new Timer(15, new PrizePanel.Listener());
      t.start();
      addMouseListener(new Mouse());
        
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Mouse extends MouseAdapter{
      public void mousePressed(MouseEvent e){
         if(e.isMetaDown()){
         ball.setX(e.getX());
         ball.setY(e.getY());
         }
         else if(e.isShiftDown()){
         int speed = (int)(Math.random() + 3);
         int dir = (int)(Math.random()*10);
         ball.setdx(dir);
         }
         else{
         pd.setX(e.getX());
         pd.setY(e.getY());
         }
         
      }
   }
   
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
         ball.move(FRAME,FRAME);
         collide(ball,pd);
         ball.draw(myBuffer);
         pd.draw(myBuffer);
           
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
         repaint();
      }
   }   
   private void collide(Ball b, Polkadot pd)
   {
      double d = distance(b.getX(),b.getY(),pd.getX(),pd.getY());  
      if(d<= pd.getRadius()+b.getRadius()){
         hits++;
         xPos = (int)(Math.random()*(FRAME-100)+50);
         yPos = (int)(Math.random()*(FRAME-100)+50);
         pd.setX(xPos);
         pd.setY(yPos);
      }
   }
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));  	 // enter the calculation here.
   }
}