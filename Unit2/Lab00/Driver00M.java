import javax.swing.JFrame;
public class Driver00M{

   public static void main(String[] args){
      JFrame frame = new JFrame("Lab00 Omkar Kulkarni");
      frame.setSize(1200,900);
      frame.setLocation(100,50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel00modify());
      frame.setVisible(true);
   }
}