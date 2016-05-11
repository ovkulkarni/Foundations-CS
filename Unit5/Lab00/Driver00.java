import java.io.*;
import java.util.*;

public class Driver00
{
public static void main(String[] args) throws Exception
   {
      Scanner infile = new Scanner(new File("data.txt"));
      int numitems = infile.nextInt();
      double[] array = new double[numitems];
      for(int k = 0; k < numitems; k++)
         array[k] = infile.nextDouble();
      infile.close();
      int minPos, maxPos;
      minPos = findMin(array);
      maxPos = findMax(array);
      System.out.println("Minimum value: " + array[minPos]);
      System.out.println("Maximum value: " + array[maxPos]);
   }

private static int findMin(double[] arr){
   int pos = 0;
   for (int i = 0; i < arr.length; i++)
      if (arr[i] < arr[pos])
         pos = i;
   return pos;
}
private static int findMax(double[] arr){
   int pos = 0;
   for (int i = 0; i < arr.length; i++)
      if (arr[i] > arr[pos])
         pos = i;
   return pos;
}
}