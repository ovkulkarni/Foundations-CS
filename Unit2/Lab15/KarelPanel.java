//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 6.17.2003

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class KarelPanel extends JPanel
{
   private static final int WIDTH = 395, HEIGHT = 391; //constants
   private static final Color BACKGROUND = new Color(204, 204, 204);

   private int xPos, yPos, dir; //fields
   private ImageIcon[] myArray;
   private BufferedImage myImage;
   private Graphics myBuffer;
   public KarelPanel()
   {
      myImage =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myArray = new ImageIcon[4];
      myArray[0] = new ImageIcon("karele.gif");   //east
      myArray[1] = new ImageIcon("kareln.gif");   //north
      myArray[2] = new ImageIcon("karelw.gif");   //west
      myArray[3] = new ImageIcon("karels.gif");   //south
      dir = 0;     //start facing east
      xPos = 5;    //starting xPos
      yPos = HEIGHT - 3 - myArray[dir].getImage().getHeight(null); //starting yPos
      Timer t = new Timer(100, new Listener());
      t.start();
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, WIDTH, HEIGHT);
         myBuffer.setColor(Color.RED);
         for(int x = 20; x < WIDTH; x += 30) //vertical lines
         {
            myBuffer.drawLine(x,0,x,HEIGHT);
         }
         for(int y = 9; y < HEIGHT; y += 28) //horizontal lines
         {
            myBuffer.drawLine(0,y,WIDTH,y);
         }
         myBuffer.fillRect(107, 121, 180, 56);
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 20));
         myBuffer.drawString("Karel the Robot", 125, 155);
         
      	/*************************************
      	Calculate karel's xPos and yPos.
      	At the end of each row, the dir changes.
      	The dir controls which image to use.
      	*************************************/
         int width = myArray[0].getImage().getWidth(null);
         int height = myArray[0].getImage().getHeight(null);
      
         if(dir == 0){
            xPos += 30;
            if(xPos>=WIDTH-30){
               dir = 1;
            }
         }
         else if (dir == 1){
         
            yPos -=28;
            if(yPos<=0){
               dir = 2;
            }
         
         }
         else if (dir == 2){
            xPos -= 30;
            if(xPos<=width){
               dir = 3;
            }
         
         }
         else if (dir == 3){
            yPos += 28;
            if(yPos>=HEIGHT-height){
               return;
            }
         }
      
      
      
         myBuffer.drawImage(myArray[dir].getImage(), xPos, yPos, null);
         
         repaint();
      }
   }
}
