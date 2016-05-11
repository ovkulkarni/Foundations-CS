//Name______________________________ Date_____________
import javax.swing.*;
import java.awt.*;
public class ScoreCard13 extends JPanel
{
   private JTextField[][] input;
   public ScoreCard13()
   {
      setLayout(new GridLayout(5, 18));
   
      for(int hole = 1; hole <= 18; hole++)
      {
         add(new JLabel("" + hole, SwingConstants.CENTER));
      }
   
      input = new JTextField[4][18];
      for(int r = 0; r < input.length; r++)
         for(int c = 0; c < input[0].length; c++)
         {
            input[r][c] = new JTextField();
            add(input[r][c]);
         }
   }
   public void randomize()
   {
      for (int row = 0; row < input.length; row++) {
         for (int col = 0; col < input[0].length; col++) {
            input[row][col].setText("" + (int)(Math.random() * 4.0D + 1.0D));
         }
      }
   }
   public int findTotal(int r)
   {
      int total = 0;
      for (int c = 0; c < input[0].length; c++) {
         total += Integer.parseInt(input[r][c].getText());
      }
      return total;
   }
   public int findAces(int r)
   {
      int aces = 0;
      for (int c = 0; c < input[0].length; c++) {
         if (Integer.parseInt(input[r][c].getText()) == 1) {
            aces++;
         }
      }
      return aces;
   }
   public int findHardestHole(int r)
   {
      int holeNumber = 0;
      int value = Integer.parseInt(input[r][0].getText());
      for (int col = 1; col < input[0].length; col++) {
         if (Integer.parseInt(input[r][col].getText()) > value)
         {
            holeNumber = col;
            value = Integer.parseInt(input[r][col].getText());
         }
      }
      return holeNumber + 1;
   }
   public int findHardestHole()
   {
      int hole = 0;
      int maxSoFar = 0;
      for (int c = 0; c < this.input[0].length; c++)
      {
         int vertical = 0;
         for (int r = 0; r < this.input.length; r++) {
            vertical += Integer.parseInt(this.input[r][c].getText());
         }
         if (vertical > maxSoFar)
         {
            hole = c;
            maxSoFar = vertical;
         }
      }
      return hole + 1;
   }

}