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
public class Display08 extends JPanel
{
   private JLabel label;
   private JTextField box1, box2, box3;
   public Display08()
   {
      setLayout(new GridLayout(4,2));
   
      add(new JLabel("Terms:", SwingConstants.RIGHT));
      box1 = new JTextField("", 5);
      box1.setHorizontalAlignment(SwingConstants.LEFT);
      add(box1);
   
      add(new JLabel("First:", SwingConstants.RIGHT));
      box2 = new JTextField("", 5);
      box2.setHorizontalAlignment(SwingConstants.LEFT);
      add(box2);
   
      add(new JLabel("Ratio:", SwingConstants.RIGHT));
      box3 = new JTextField("", 5);
      box3.setHorizontalAlignment(SwingConstants.LEFT);
      add(box3);
   
      add(new JLabel("Sum:", SwingConstants.RIGHT));
      label = new JLabel("");
      label.setFont(new Font("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
   }
   public void sumFinite()
   {
      int terms = Integer.parseInt(box1.getText());
      double first = Integer.parseInt(box2.getText());
      double ratio = Double.parseDouble(box3.getText());
      double result;
      result = first;
      for(int k = 1; k<terms; k++){
         first=first*ratio;
         result = result+first;
      }
      label.setText(""+result); 
   
   }
   public void sumInfinite()
   {
   
      int terms = Integer.parseInt(box1.getText());
      int first = Integer.parseInt(box2.getText());
      double ratio = Double.parseDouble(box3.getText());
      if(ratio>1){
         label.setText("None");
      }
      else if(ratio<1){
         double result = first/(1-ratio);
         label.setText(""+result);
      }
      else{
         label.setText("1");
      }
   }
}