   //Name:    Date:

import javax.swing.*;
import java.awt.*;
public class Display11 extends JPanel
{
   private JLabel[] output;
   private int[] bits;
   public Display11()
   {
      setLayout(new GridLayout(1, 8));
      
      output = new JLabel[8];
      bits = new int[8];
      for(int x = 0; x <= 7; x++)
      {
         output[x] = new JLabel("", SwingConstants.CENTER);
         output[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(output[x]);
      }
      setBlank();
   }
   public void setBlank()
   {    
      for(int x = 0; x < output.length; x++)
         output[x].setText("-");   
   }
   public void setValue( int num )
   {
         String binary = Integer.toBinaryString(num);
         while(binary.length() < 8){
            binary = "0" + binary;
         }
         char[] array = binary.toCharArray();
         for(int i = 0; i < output.length; i++)
            output[i].setText(""+array[i]);
        //display the binary number in the JLabel
        
   }
}