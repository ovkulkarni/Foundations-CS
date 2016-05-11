import javax.swing.JOptionPane;
public class Stuff{
  
   public static void main(String[] args){
      String number = JOptionPane.showInputDialog("Enter a number.");
      int num = Integer.parseInt(number);
      int num2 = 1;
      int num3 = 0;
      int  num4 = 0;
      int times = 0;
      while(times<=num){
         if(times == 0)
            System.out.println(num2);
         System.out.println(num2);
         num4 = num3;
         num3 = num2;
         num2 = num3+num4;
         times++;
      }
   }
}