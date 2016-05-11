//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel07 extends JPanel
{
   private Display07 display;
   private JLabel label1, label2;
   private JTextField box1, box2;
   public Panel07()
   {
      setLayout(new FlowLayout());
   
      display = new Display07();
      add(display);
   
      JButton button = new JButton("GCD");
      button.addActionListener(new ListenerGCD());
      add(button);
      
      JButton button2 = new JButton("LCM");
      button2.addActionListener(new ListenerLCM());
      add(button2);
   }
   private class ListenerGCD implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.showGCD();
      }
   }
   private class ListenerLCM implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.showLCM();
      
      }
   }
}