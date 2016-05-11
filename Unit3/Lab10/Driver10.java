   import javax.swing.JFrame;
   public class Driver10
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Driver10");
         frame.setSize(200, 200);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel10());
         frame.setVisible(true);
      }
   }