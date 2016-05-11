import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel02 extends JPanel{
   private JLabel label;
   private JTextField box;
   public Panel02(){
      setLayout(new FlowLayout());
      label = new JLabel("0.0");
      label.setFont(new Font("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
      JButton button1 = new JButton("Random");
      button1.addActionListener(new Listener1());
      add(button1);
      JButton button2 = new JButton("Cube Root");
      button2.addActionListener(new Listener2());
      add(button2);
      JButton button3 = new JButton("Reciprocal");
      button3.addActionListener(new Listener3());
      add(button3);
      JButton button4 = new JButton("Quit");
      button4.addActionListener(new Listener4());
      add(button4);
   }
   private class Listener1 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         double a = Math.random();
         label.setText("" + a);
      }
   }
   private class Listener2 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         double x = Double.parseDouble(label.getText());
         double d = Math.pow(x, 1.0/3.0);
         label.setText("" + d);
         
      }
   }
   private class Listener3 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         double c = Double.parseDouble(label.getText());
         double b = 1/c;
         label.setText("" + b);
      }
   }
   private class Listener4 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         System.exit(0);
      }
   }
}