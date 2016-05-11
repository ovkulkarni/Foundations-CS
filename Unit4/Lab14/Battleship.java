	//Name______________________________ Date_____________
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Battleship
  extends JPanel
{
   private JButton[][] board;
   private int[][] matrix;
   private int hits;
   private int torpedoes;
   private JLabel label;
   private JButton reset;
   
   public Battleship()
   {
      setLayout(new BorderLayout());
      hits = 0;
      torpedoes = 20;
      
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, "North");
      label = new JLabel("You have 20 torpedoes.");
      north.add(label);
      
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(10, 10));
      add(center, "Center");
      board = new JButton[10][10];
      matrix = new int[10][10];
      for (int r = 0; r < 10; r++) {
         for (int c = 0; c < 10; c++)
         {
            matrix[r][c] = 0;
            board[r][c] = new JButton();
            board[r][c].setBackground(Color.blue);
            board[r][c].addActionListener(new Handler1(r, c));
            center.add(board[r][c]);
         }
      }
      reset = new JButton("Reset");
      reset.addActionListener(new Handler2());
      reset.setEnabled(false);
      add(reset, "South");
      
      placeShip();
   }
   
   private void placeShip()
   {
      int coin = (int)(Math.random() * 2.0D + 1.0D);
      if (coin == 1)
      {
         int row = (int)(Math.random() * 7.0D);
         int col = (int)(Math.random() * 10.0D);
         for (int x = 0; x < 4; x++) {
            matrix[(row + x)][col] = 1;
         }
      }
      else
      {
         int row = (int)(Math.random() * 10.0D);
         int col = (int)(Math.random() * 7.0D);
         for (int x = 0; x < 4; x++) {
            matrix[row][(col + x)] = 1;
         }
      }
   }
   
   private class Handler1
     implements ActionListener
   {
      private int myRow;
      private int myCol;
      
      public Handler1(int r, int c)
      {
         myRow = r;
         myCol = c;
      }
      
      public void actionPerformed(ActionEvent e)
      {
         torpedoes -= 1;
         if (matrix[myRow][myCol] == 1)
         {
            label.setText("Hit! " + torpedoes + " torpedoes remaining.");
            matrix[myRow][myCol] = 3;
            board[myRow][myCol].setEnabled(false);
            board[myRow][myCol].setBackground(Color.red);
            hits++;
         }
         else
         {
            label.setText("Miss! " + torpedoes + " torpedoes remaining.");
            matrix[myRow][myCol] = 2;
            board[myRow][myCol].setEnabled(false);
            board[myRow][myCol].setBackground(Color.white);
         }
         if ((hits == 4) || (torpedoes == 0))
         {
            reset.setEnabled(true);
            for (int r = 0; r < 10; r++) {
               for (int c = 0; c < 10; c++) {
                  board[r][c].setEnabled(false);
               }
            }
            if (hits == 4) {
               label.setText("You sunk my battleship!");
            } 
            else {
               for (int r = 0; r < 10; r++) {
                  for (int c = 0; c < 10; c++) {
                     if (matrix[r][c] == 1) {
                        board[r][c].setBackground(Color.black);
                     }
                  }
               }
            }
         }
      }
   }
   
   private class Handler2
     implements ActionListener
   {
      private Handler2() {}
      
      public void actionPerformed(ActionEvent e)
      {
         hits = 0;
         torpedoes = 20;
         for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++)
            {
               board[r][c].setEnabled(true);
               board[r][c].setBackground(Color.blue);
               matrix[r][c] = 0;
            }
         }
         label.setText("You have "+ torpedoes + " torpedoes.");
         placeShip();
         reset.setEnabled(false);
      }
   }
}
