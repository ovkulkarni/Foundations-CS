//
//name:        date:
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//
public class PanelPix extends JPanel
{

   private DisplayPix display;

   private ScoreboardPix scoreboard;
   
   private JTextField modify;
   
   private JLabel error;

   public PanelPix()
   {
      setLayout(new BorderLayout());
   //
   // north
   //
      JPanel north = new JPanel();
      north.setLayout(new GridLayout(2,1));
      scoreboard = new ScoreboardPix();
      north.add(scoreboard);
      error = new JLabel("");
      north.add(error);
      add(north, BorderLayout.NORTH);
   //
   // east
   //
      JPanel east = new JPanel();
      east.setLayout(new GridLayout(22,1));
   /******************************************************************  1 */
      JButton zero = new JButton("Zero Blue");
      zero.addActionListener(new Listener_zeroBlue());
      east.add(zero);
   /******************************************************************  2 */
      JButton negate = new JButton("Negate");
      negate.addActionListener(new Listener_negate());
      east.add(negate);
   /******************************************************************  3 */
      JButton gray = new JButton("Grayscale");
      gray.addActionListener(new Listener_grayscale());
      east.add(gray);
   /******************************************************************  4 */
      JButton sepia = new JButton("Sepia Tone");
      sepia.addActionListener(new Listener_sepia());
      east.add(sepia);
   /******************************************************************  5 */
      JButton blur = new JButton("Blur");
      blur.addActionListener(new Listener_blur());
      east.add(blur);			
   /******************************************************************  6 */
      JButton posterize = new JButton("Posterize");
      posterize.addActionListener(new Listener_posterize());
      east.add(posterize);			
   /******************************************************************  7 */
      JButton splash = new JButton("Color Splash");
      splash.addActionListener(new Listener_colorSplash());
      east.add(splash);					
   /******************************************************************  8 */
      JButton mirrorLR = new JButton("Mirror Left-Right");
      mirrorLR.addActionListener(new Listener_mirrorLR());
      east.add(mirrorLR);			
   /******************************************************************  9 */
      JButton mirrorUD = new JButton("Mirror Up-Down");
      mirrorUD.addActionListener(new Listener_mirrorUD());
      east.add(mirrorUD);
   /****************************************************************** 10 */
      JButton flipLR = new JButton("Flip Left-Right");
      flipLR.addActionListener(new Listener_flipLR());
      east.add(flipLR);
   /****************************************************************** 11 */
      JButton flipUD = new JButton("Flip Up-Down");
      flipUD.addActionListener(new Listener_flipUD());
      east.add(flipUD);			
   /****************************************************************** 12 */
      JButton pixelate = new JButton("Pixelate");
      pixelate.addActionListener(new Listener_pixelate());
      east.add(pixelate);			
   /****************************************************************** 13 */
      JButton sunsetize = new JButton("Sunsetize");
      sunsetize.addActionListener(new Listener_sunsetize());
      east.add(sunsetize);	
   /****************************************************************** 14 */
      JButton redeye = new JButton("Remove Red-Eye");
      redeye.addActionListener(new Listener_redEye());
      east.add(redeye);									
   /****************************************************************** 15 */
      JButton detect = new JButton("Edge Detector");
      detect.addActionListener(new Listener_edgeDetector());
      east.add(detect);
   /****************************************************************** 16a */
      JButton encoder = new JButton("Encode");
      encoder.setEnabled(false);
      east.add(encoder);
   /****************************************************************** 16b */
      JButton decoder = new JButton("Decode");
      decoder.setEnabled(false);
      east.add(decoder);		
   
   /****************************************************************** 17 */
      JButton chromakey = new JButton("Chromakey");
      chromakey.setEnabled(false);
      east.add(chromakey);	
      
      JButton modifyred = new JButton("Modify Red");
      modifyred.addActionListener(new Listener_modifyRed());
      east.add(modifyred);
      
      JButton modifygreen = new JButton("Modify Green");
      modifygreen.addActionListener(new Listener_modifyGreen());
      east.add(modifygreen);
      
      JButton modifyblue = new JButton("Modify Blue");
      modifyblue.addActionListener(new Listener_modifyBlue());
      east.add(modifyblue);
      
      JButton getSum = new JButton("Get Sum");
      getSum.addActionListener(new Listener_getSum());
      east.add(getSum);
   
   /****************************************************************** END */      
      add(east,BorderLayout.EAST);
   //
   // center
   //
      display = new DisplayPix();
      display.addMouseListener(new Mouse());
   
      display.addKeyListener(new Key());
      display.setFocusable(true);
      add(display,BorderLayout.CENTER);
   //
   // south
   //
      JPanel south = new JPanel();
      south.setLayout(new FlowLayout());
      JButton restore = new JButton("Restore Original Image");
      restore.addActionListener(new Listener_restore());
      south.add(restore);
      JButton openimg = new JButton("Open an Image File");
      openimg.addActionListener(new Listener_openimg());
      south.add(openimg);
      JButton undo = new JButton("Undo");
      undo.addActionListener(new Listener_undo());
      south.add(undo);
      modify = new JTextField("100");
      south.add(modify);
      add(south,BorderLayout.SOUTH);
   }    
//
/**********************************************************************/
//
// pixel operation listener
// 
   private class Listener_zeroBlue implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.zeroBlue();
         update( display.getXval() , display.getYval() );
      }
   } 
//  ---------->  add more Listeners here   <-----------

   private class Listener_negate implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.negate();
         update( display.getXval() , display.getYval() );
      }
   } 
   private class Listener_grayscale implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.grayscale();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_sepia implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.sepia();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_blur implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.blur();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_posterize implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.posterize();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_colorSplash implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.colorSplash();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_mirrorLR implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.mirrorLR();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_mirrorUD implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.mirrorUD();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_flipLR implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.flipLR();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_flipUD implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.flipUD();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_pixelate implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.pixelate();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_sunsetize implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.sunsetize();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_redEye implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.redEye();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_edgeDetector implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.edgeDetector();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_undo implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.undo();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_modifyRed implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int value = Integer.parseInt(modify.getText());
         if(value < 0) 
         {
            error.setText("Negative Value Detected, using 0");
            value = 0;
         }
         else if (value > 200)
         {
            error.setText("Value Too Large, using 200");
            value = 200;
         }
         else{
            error.setText("");
         }
         display.modifyRed(value);
         modify.setText("100");
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_modifyGreen implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int value = Integer.parseInt(modify.getText());
         if(value < 0) 
         {
            error.setText("Negative Value Detected, using 0");
            value = 0;
         }
         else if (value > 200)
         {
            error.setText("Value Too Large, using 200");
            value = 200;
         }
         else{
            error.setText("");
         }
         display.modifyGreen(value);
         modify.setText("100");
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_modifyBlue implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int value = Integer.parseInt(modify.getText());
         if(value < 0) 
         {
            error.setText("Negative Value Detected, using 0");
            value = 0;
         }
         else if (value > 200)
         {
            error.setText("Value Too Large, using 200");
            value = 200;
         }
         else{
            error.setText("");
         }
         display.modifyBlue(value);
         modify.setText("100");
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_getSum implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         error.setText(""+display.getSum());
      }
   }



//   
/**********************************************************************/
//
   private class Listener_restore implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.resetImage();
         update( display.getXval() , display.getYval() );
      }
   }
   private class Listener_openimg implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if( display.openImage() )
         {
            update( display.getXval() , display.getYval() );
         }
      }
   }
   private class Mouse extends MouseAdapter
   {
      public void mouseClicked(MouseEvent e)
      {
         update( e.getX() , e.getY() );
      }
   }
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      {
         switch( e.getKeyCode() )
         {
            case KeyEvent.VK_UP:    display.up();    
               break;
            case KeyEvent.VK_DOWN:  display.down();  
               break;
            case KeyEvent.VK_LEFT:  display.left();  
               break;
            case KeyEvent.VK_RIGHT: display.right(); 
               break;
         }
      //
         update( display.getXval() , display.getYval() );
      }
   }     
   private void update(int x, int y)
   {
      int rgb = display.getRGB(x,y);
   //
      scoreboard.update(x,y,rgb);
   //
      display.update(x,y);
      display.repaint();
   //
      display.requestFocus();
   }
}
//
// end of file
//