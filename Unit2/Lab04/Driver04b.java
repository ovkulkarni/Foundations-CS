import javax.swing.*;
import edu.fcps.Bucket;

public class Driver04b{

   public static void main(String[] args){
      JFrame frame = new JFrame("Buckets");
      frame.setSize(600,400);
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(10);
      Bucket.useTotal(true);
      Bucket five = new Bucket(5);
      Bucket four = new Bucket(4);
      Bucket three = new Bucket(3);
      three.fill();
      four.fill();
      five.fill();
      three.spill();
      five.spill();
      four.pourInto(three);
      three.spill();
      five.fill();
      four.spill();
      three.fill();
      three.pourInto(four);
      three.fill();
      three.pourInto(four);
      four.spill();
      three.pourInto(four);
      three.fill();  
      five.spill();
      three.spill();    
   
         
         
      
   }
}
