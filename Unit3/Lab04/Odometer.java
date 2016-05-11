	//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class Odometer extends JPanel
{
   private Label hundred;
   private Label ten;
   private Label one;
   int count = 0;
   
   public Odometer()
   {
      setBackground(Color.black);
      hundred = new Label();
      hundred.setBackground(Color.black);
      hundred.setForeground(Color.white);
      hundred.setText("0");
      add(hundred);
      ten = new Label();
      ten.setBackground(Color.black);
      ten.setForeground(Color.white);
      ten.setText("0");
      add(ten);
      one = new Label();
      one.setBackground(Color.white);
      one.setForeground(Color.black);
      one.setText("0");
      add(one);
            
   }
   public void update()
   {
      count++;
      int hundreds = count / 100;
      hundred.setText("" + hundreds);
      int tens  = count % 100;
      tens = tens / 10;
      ten.setText("" + tens);
      int ones = count % 100;
      ones = ones % 10;
      one.setText(""+ones);
   }
}