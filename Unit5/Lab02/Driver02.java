	//Name______________________________ Date_____________
   import java.io.*;
   import java.util.*;
   
    public class Driver02
   {
       public static void main(String[] args) throws Exception
      {
         double[] array = input("../Lab00/data.txt");
         sort(array);
         output(array, "output.txt");
      }
       public static double[] input(String filename) throws Exception
      {
         	Scanner infile = new Scanner(new File(filename));
         int numitems = infile.nextInt();
         double[] array = new double[numitems];
         for(int k = 0; k < numitems; k++)
            array[k] = infile.nextDouble();
         infile.close();
         return array;
      }
       public static void sort(double[] array)
      {
         int maxPos;
         for(int k = 0; k < array.length; k++)
         {
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
         }
      }
       public static int findMax(double[] array, int upper) //what does "upper" do???
      {
         	int max = 0;
            for(int i = 0; i <= upper; i ++)
               if(array[i] > array[max])
                  max = i;
            return max;
      }
       public static void swap(double[] array, int a, int b)//what are "a" and "b" for???
      {
         	double temp = array[b];
            array[b] = array[a];
            array[a] = temp;
            
      }
       public static void output(double[] array, String filename) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream(filename)));
         for(int k = 0; k < array.length; k++)
            System.out.println(array[k]);
      }
   }