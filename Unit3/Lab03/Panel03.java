//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel03 extends JPanel
{
   private JLabel label1, label2;
   private JTextField box;
   private int number, count;
   int iter= 0;
   public Panel03()
   {
      setLayout(new FlowLayout());
      number = 37;     //number gets 37
      count = 0;
   
      label1 = new JLabel("37");
      label1.setFont(new Font("Serif", Font.BOLD, 100));
      label1.setForeground(Color.blue);
      add(label1);
   
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel);
   
      box = new JTextField("37", 5);
      box.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(box);
   
      JButton button1 = new JButton("Set");
      button1.addActionListener(new Listener1());
      panel.add(button1);
   
      JButton button2 = new JButton("Next");
      button2.addActionListener(new Listener2());
      panel.add(button2);
   
      JButton button3 = new JButton("Quit");
      button3.addActionListener(new Listener3());
      panel.add(button3);
   
      label2 = new JLabel("Iterations: 0");
      add(label2);
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      
         int x = Integer.parseInt(box.getText());
         label1.setText("" + x);
      
      }
   }
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int in = Integer.parseInt(label1.getText());
         int result;
         if(in%2 == 0){
            result = in/2;
         }
         else{
            result = (in*3)+1;
         }
         iter++;
         label1.setText("" + result);
         label2.setText("Iterations: " + iter);
      }
   }
   private class Listener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      
      	System.exit(0);
      
      }
   }
}