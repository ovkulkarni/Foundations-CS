public class Lab12WarmUp
{
   public static void main(String[] args)
   {
      for(int x = 1; x <= 7; x++){
         for(int y = 1; y <= 8 - x; y++){
         System.out.print("*");
         }
         System.out.println();
      }
   }
}