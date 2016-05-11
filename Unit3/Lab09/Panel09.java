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
   import java.text.DecimalFormat;
    public class Panel09 extends JPanel
   {
      private JLabel label;
      private double total;
       public Panel09()
      {
         setLayout(new BorderLayout());
         total = 0.0;
         JPanel panel = new JPanel();
         panel.setLayout(new GridLayout(2, 3, 10, 0));
         add(panel, BorderLayout.CENTER);
         addButton(panel, "+1.00", 1.0);
         addButton(panel, "+0.10", 0.1);
         addButton(panel, "+0.01", 0.01);
         addButton(panel, "-1.00", -1.0);
         addButton(panel, "-0.10", -0.1);
         addButton(panel, "-0.01", -0.01);
         label = new JLabel("$0.00");
         label.setHorizontalAlignment(0);
         add(label, BorderLayout.NORTH);         
      }
       private void addButton(JPanel panel, String s, double x)
      {
      JButton button = new JButton(s);
      button.addActionListener(new Panel09.Listener(x));
      panel.add(button);
      
           
      }
       private class Listener implements ActionListener
      {
         private double myX;
          public Listener(double x)
         {
            myX = x;
         }
          public void actionPerformed(ActionEvent e)
         {
           total = total + myX;
           DecimalFormat d = new DecimalFormat("$0.00");
           label.setText(d.format(total));
         }
      }
   }