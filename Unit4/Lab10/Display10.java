   //Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Display10 extends JPanel
{
   private JLabel[] bits;
   private JLabel decimalLabel;
   public Display10()
   {
      setLayout(new GridLayout(1, 9));
      bits = new JLabel[8];
      for(int x = 0; x < bits.length; x++)
      {
         bits[x] = new JLabel("0", SwingConstants.CENTER);
         bits[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(bits[x]);
      }
      decimalLabel = new JLabel("0", SwingConstants.CENTER);
      decimalLabel.setFont(new Font("Serif", Font.BOLD, 20));
      add(decimalLabel);
      randomize();
   }
   public void randomize()
   {
      for (int x = 0; x < bits.length; x++) {
         bits[x].setText("" + (int)(Math.random() * 2.0D));
      }
      setDecimal();
   }
   public void reverse()
   {
      String[] array = new String[bits.length];
      for (int x = 0; x < bits.length; x++) {
         array[x] = bits[x].getText();
      }
      for (int x = 0; x < bits.length; x++) {
         bits[x].setText(array[(bits.length - x - 1)]);
      }
      setDecimal();
   }
   public void setDecimal(){
      String binary = "";
      for(int x = 0; x < bits.length; x++){
         binary += bits[x].getText();
      }
      int decimal = Integer.parseInt(binary, 2);
      decimalLabel.setText(""+decimal);
   }
      
   public void shift()
   {
      for (int x = 0; x < bits.length - 1; x++) {
         bits[x].setText(bits[(x + 1)].getText());
      }
      bits[(bits.length - 1)].setText("0");
      setDecimal();
   }
   public void rotate()
   {
      String temp = bits[0].getText();
      for (int x = 0; x < bits.length - 1; x++) {
         bits[x].setText(bits[(x + 1)].getText());
      }
      bits[(bits.length - 1)].setText(temp);
      setDecimal();
   }
}