	//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Dice extends JPanel
{
   private JLabel label1, label2;
   public Dice()
   {
      setLayout(new GridLayout(1, 2, 5, 5));
      
      label1 = new JLabel();
      label1.setIcon(new ImageIcon("one.jpg"));
      add(label1);
      
      label2 = new JLabel();
      label2.setIcon(new ImageIcon("one.jpg"));
      add(label2);
   }
   public int roll()
   {
      int a = rollOne(label1);
      int b = rollOne(label2);
      return a + b;
   }
   private int rollOne(JLabel label)
   {
      int x = (int)(Math.random()*6 + 1);
      switch(x){
         case 1:
            label.setIcon(new ImageIcon("one.jpg"));
            return 1;
         case 2:
            label.setIcon(new ImageIcon("two.jpg"));
            return 2;
         case 3:
            label.setIcon(new ImageIcon("three.jpg"));
            return 3;
         case 4:
            label.setIcon(new ImageIcon("four.jpg"));
            return 4;
         case 5:
            label.setIcon(new ImageIcon("five.jpg"));
            return 5;
         case 6:
            label.setIcon(new ImageIcon("six.jpg"));
            return 6;
         default:
            return 0;
      }
        
      
   }
}