	//Name______________________________ Date_____________
import java.io.*;
import java.util.*;
   
public class Driver03
{
   public static void main(String[] args) throws Exception
   {
      int[] array = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
      print(array);
      scramble(array);
      print(array);
      sort(array);
      print(array);
         
   }
    
   public static void scramble(int[] array){
      for(int i = 0; i < array.length; i++){
         int newIndex = (int)(Math.random() * array.length + 1);
         swap(array, i , newIndex);
      }
   }  
   
   public static void print(int[] array){
      System.out.println(Arrays.toString(array));
   }
   
   public static void sort(int[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static int findMax(int[] array, int upper) //what does "upper" do???
   {
      int max = 0;
      for(int i = 0; i <= upper; i ++)
         if(array[i] > array[max])
            max = i;
      return max;
   }
   public static void swap(int[] array, int a, int b)//what are "a" and "b" for???
   {
      int temp = array[b];
      array[b] = array[a];
      array[a] = temp;
            
   }
   public static void output(int[] array, String filename) throws Exception
   {
      System.setOut(new PrintStream(new FileOutputStream(filename)));
      for(int k = 0; k < array.length; k++)
         System.out.println(array[k]);
   }
}