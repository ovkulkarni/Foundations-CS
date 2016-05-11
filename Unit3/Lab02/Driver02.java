import javax.swing.JFrame;
public class Driver02{

   public static void main(String[] args){
      JFrame frame = new JFrame("Lab01");
      frame.setSize(800,450);
      frame.setLocation(100,50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel02());
      frame.setVisible(true);
   }
}