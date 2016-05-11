import edu.fcps.karel2.*;
public class LabYY{
   public static void main(String[] args){
      final int N = (int)(Math.random()*50+25);
      Display.setSize(N,N);
      WorldBackend.getCurrent().putBeepers((int)(Math.random()*N+1),(int)(Math.random()*N+1),1);
      Robot[] karel = new Robot[N];
   }
}