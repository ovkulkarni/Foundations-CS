import java.io.*;
public class program{
   public static void main(String[] args){
      String w1 = "Apples";
      String w2 = "are";
      String w3 = "Delicious";
      String v1 = "A";
      String v2 = "a";
     PrintWriter writer = new PrintWriter("piglatin1.out");

      if(w1.startsWith(v1)){
         writer.println(w1+"yay");
      
         if(w2.startsWith(v2)){
            writer.println(w2+"yay");
         }
         if(!w3.startsWith(v1)){
            writer.println("eliciousDay");
         }
      }
     writer.close();
   }
}