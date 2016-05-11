//Name______________________________ Date_____________
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
public class Driver05
{
   public static void main(String[] args) throws Exception
   {
      Comparable[] array = input("data.txt");
      sort(array);
      output(array, "output.txt");
   }
	
   public static Comparable[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt();
      Comparable[] array = new Distance[numitems];
      for(int k = 0; k < numitems; k++)
      {
         int x = infile.nextInt();
         int y = infile.nextInt();
         array[k] = new Distance(x, y);
      }
      infile.close();
      return array;
   }
   
   public static void output(Object[]array, String filename) throws Exception
   {
      System.setOut(new PrintStream(new FileOutputStream(filename)));
      for(int k = 0; k < array.length; k++)
         System.out.println(array[k].toString());
   }
   
   public static void sort(Comparable[] array)
   {
      for(int k = 0; k < array.length; k++)
      {
         int maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static int findMax(Comparable[] array, int upper) //what does "upper" do???
   {
      int max = 0;
      for(int i = 1; i <= upper; i ++)
         if(array[i].compareTo(array[max]) > 0)
            max = i;
      return max;
   }
   public static void swap(Object[] array, int a, int b)//what are "a" and "b" for???
   {
      Object temp = array[b];
      array[b] = array[a];
      array[a] = temp;
            
   }

      	/****************************/
      	/*                          */
      	/* Helper methods go here.  */
      	/*                          */
      	/****************************/

}