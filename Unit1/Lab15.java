import edu.fcps.karel2.Display;
public class Lab15
{
  public static void main(String[] args)
  {
  Display.setSize(20,20);
  Display.setSpeed(10);
    Thread t1 = new Thread(new FiveDancer(8,15,25));
    Thread t2 = new Thread(new DiagSquareDancer(12,10,30));
    Thread t3 = new Thread(new DiamondDancer(16,5,35));
    
    t1.start();
    t2.start();
    t3.start();
  }
}
