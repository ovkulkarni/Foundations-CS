//
// Torbert, 24 July 2013
//
   import java.awt.*;
   import java.awt.image.BufferedImage;
   import java.io.File;
   import javax.swing.*;
   import java.util.Stack;
//
   public class DisplayPix extends JPanel
   {
      private PixelOperations pix = new PixelOperations();
   
      private ImageIcon i = new ImageIcon("images/beach.jpg");
   
      private BufferedImage img= new BufferedImage(1600,1200,BufferedImage.TYPE_INT_RGB);
   
      private Graphics buf = img.getGraphics();
   
      private boolean clicked = false;
      
      private int x , y;
      
      private Stack s = new Stack();
   
      public DisplayPix()
      {
         int w = img.getWidth();
         int h = img.getHeight();
      //
         buf.drawImage( i.getImage() , 0 , 0 , w , h , null );
         saveImage(pix.getArray( img ));
      }
      public int getXval() // not getX !
      {
         return x;
      } 
      public int getYval() // not getY !
      {
         return y;
      }  
      public int getRGB(int x, int y)
      {
         int xpos = x * img.getWidth( ) / getWidth() ;
         int ypos = y * img.getHeight() / getHeight();
      //
         return img.getRGB(xpos,ypos);
      }      
      public void update(int xval, int yval)
      {
         clicked = true;
      //
         x       = xval;
         y       = yval;
      }  
   //
   /**********************************************************************/
   //
   // pixel operations
   // 
      public void zeroBlue()
      {
         Color[][] tmp = pix.getArray( img );
         pix.zeroBlue( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
   //
   //    ------>  enter your methods below  <-----------
   
      public void negate()
      {
         Color[][] tmp = pix.getArray( img );
         pix.negate( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void grayscale()
      {
         Color[][] tmp = pix.getArray( img );
         pix.grayscale( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void sepia()
      {
         Color[][] tmp = pix.getArray( img );
         pix.sepia( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void blur()
      {
         Color[][] tmp = pix.getArray( img );
         pix.blur( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void posterize()
      {
         Color[][] tmp = pix.getArray( img );
         pix.posterize( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void colorSplash()
      {
         Color[][] tmp = pix.getArray( img );
         pix.colorSplash( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void mirrorLR()
      {
         Color[][] tmp = pix.getArray( img );
         pix.mirrorLR( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void mirrorUD()
      {
         Color[][] tmp = pix.getArray( img );
         pix.mirrorUD( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void flipLR()
      {
         Color[][] tmp = pix.getArray( img );
         pix.flipLR( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void flipUD()
      {
         Color[][] tmp = pix.getArray( img );
         pix.flipUD( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void pixelate()
      {
         Color[][] tmp = pix.getArray( img );
         pix.pixelate( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void sunsetize()
      {
         Color[][] tmp = pix.getArray( img );
         pix.sunsetize( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void redEye()
      {
         Color[][] tmp = pix.getArray( img );
         pix.redEye( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void edgeDetector()
      {
         Color[][] tmp = pix.getArray( img );
         pix.edgeDetector( tmp );
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void modifyRed(double value)
      {
         Color[][] tmp = pix.getArray( img );
         pix.modifyRed( tmp , value/100);
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void modifyGreen(double value)
      {
         Color[][] tmp = pix.getArray( img );
         pix.modifyGreen( tmp , value/100);
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      public void modifyBlue(double value)
      {
         Color[][] tmp = pix.getArray( img );
         pix.modifyBlue( tmp , value/100);
         saveImage( tmp );
         pix.setImage( img , tmp );
      }
      private void saveImage( Color[][] arr )
      {
         s.push( arr );
      }
      public void undo()
      {
         if(!s.empty()){
            Color[][] tmp = pix.getArray( img );
            pix.undo( s , tmp);
            saveImage( tmp );
            pix.setImage(img, tmp);
         }
      }
      public int getSum()
      {
         Color[][] tmp = pix.getArray( img );
         return pix.getSum( tmp );
      }

   
   
   
   
   
   /**********************************************************************/
   //  
      public void resetImage()
      {
         int w = img.getWidth();
         int h = img.getHeight();
      //
         buf.drawImage( i.getImage() , 0 , 0 , w , h , null );
         saveImage(pix.getArray(img));
      }  
      public boolean openImage()
      {
         int w = img.getWidth();
         int h = img.getHeight();
      //
         JFileChooser fc = new JFileChooser("images");
         fc.showOpenDialog( null );
         File f = fc.getSelectedFile();
      //
         try {
            i = new ImageIcon("images/" + f.getName());
         }
            catch(Exception e)
            {
               return false;
            }
         buf.drawImage( i.getImage() , 0 , 0 , w , h , null );
         saveImage(pix.getArray( img ));
      //
         return true;
      }  
      public void up()
      {
         y = Math.max( 0 , y-1 );
      }
      public void down()
      {
         y = Math.min( getHeight()-1 , y+1 );
      }
      public void left()
      {
         x = Math.max( 0 , x-1 );
      }
      public void right()
      {
         x = Math.min( getWidth()-1 , x+1 );
      }   
      public void paintComponent(Graphics g)
      {
         g.drawImage( img , 0 , 0 , getWidth() , getHeight() , null );
      //
         if(clicked)
         {
            g.setColor(Color.black);
            g.drawLine(x-5,y-1,x+5,y-1);
            g.drawLine(x-5,y+1,x+5,y+1);
            g.drawLine(x-1,y-5,x-1,y+5);
            g.drawLine(x+1,y-5,x+1,y+5);
         //
            g.setColor(Color.yellow);
            g.drawLine(x-5,y,x-1,y);
            g.drawLine(x+1,y,x+5,y);
            g.drawLine(x,y-5,x,y-1);
            g.drawLine(x,y+1,x,y+5);
         }
      
      }
   }
//
// end of file
//