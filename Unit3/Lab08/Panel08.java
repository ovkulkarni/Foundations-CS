  /*
  ____                     ____       _
 / ___|___  _ __ ___  _ __/ ___|  ___(_)
| |   / _ \| '_ ` _ \| '_ \___ \ / __| |
| |__| (_) | | | | | | |_) |__) | (__| |
 \____\___/|_| |_| |_| .__/____/ \___|_|
                     |_|                 
*/
   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel08 extends JPanel
   {
      private Display08 display;
      public Panel08()
      {
         setLayout(new FlowLayout());
      
         display = new Display08();
         add(display, BorderLayout.CENTER);
      
            JPanel a = new JPanel(new FlowLayout());
         	JButton button1 = new JButton("Finite");
            button1.addActionListener(new Listener1());
            a.add(button1);      
            JButton button2 = new JButton("Infinite");
            button2.addActionListener(new Listener2());
            a.add(button2);
            add(a, BorderLayout.SOUTH);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         	display.sumFinite();
         
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         	display.sumInfinite();
         
         }
      }
   }