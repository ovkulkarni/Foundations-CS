import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel01 extends JPanel{
   private JLabel label;
   private JTextField box;
   public Panel01(){
      setLayout(new FlowLayout());
      box = new JTextField("0.0",10);
      box.setHorizontalAlignment(SwingConstants.RIGHT);
      add(box);
      label = new JLabel("0.0");
      label.setFont(new Font("Serif", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
      JButton button = new JButton("SQRT");
      button.addActionListener(new Listener());
      add(button);
   }
   private class Listener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         double x = Double.parseDouble( box.getText());
         if(x < 0){
            double d = x*-1;
            d = Math.sqrt(d);
            label.setText(""+ d + "i");
         }
         else{
            double d = Math.sqrt(x);
            label.setText("" + d);
         }
      }
   }
}