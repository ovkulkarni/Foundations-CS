import javax.swing.JOptionPane;
   
public class Squares{
   public static void squares(int num){
      double num2 = 1;
      double num3 = 0;
      while(num2 <= num){
         System.out.println(num2);
         num3 = Math.pow(num2,2) + num3;
         num2++;
      }
      System.out.println(num3);
   }
   public static void squares2(int num){
      double num2 = 1;
      double num3 = 0;
      double num4 = 0;
      while(num4 <= num){
         if(num4<=num)
            num3 = Math.pow(num2,2);
         num4 = num3+num4;
         if(num4<=num)
            System.out.println(num3);
         if(num4<=num)
            num2++;
      }
   }
   public static void fib1(int num){
      int num2 = 1;
      int num3 = 0;
      int  num4 = 0;
      int times = 0;
      while(times<num){
         System.out.println(num2);
         num4 = num3;
         num3 = num2;
         num2 = num3+num4;
         times++;
      }
   }
   public static void fib2(int num){
      int num2 = 1;
      int num3 = 0;
      int  num4 = 0;
      int times = 0;
      while(num2<=num){
         System.out.println(num2);
         num4 = num3;
         num3 = num2;
         num2 = num3+num4;
      }
   }

   
   public static void main(String[] args){
      String number = JOptionPane.showInputDialog("Enter a number.");
      int user = Integer.parseInt(number);
      squares(user);
      System.out.println("  ");
      squares2(user); 
      System.out.println("  ");
      fib1(user);
      System.out.println("  ");
      fib2(user);
      
   
   }
}