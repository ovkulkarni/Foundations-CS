	//Name______________________________ Date_____________
  

   import java.io.*;
   import java.util.*;
    public class Driver01
   {
       public static void main(String[] args)
      {
      	//input
         double[] myArray = {2.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2};
      				      
      	//sort the array
         int maxIndex = 0;
         double temp;
         int pass = 0;
         for(int i = 0; i < myArray.length - pass - 1; i++){
            for(int x = 0; x < myArray.length - pass - 1; x++)
               if(myArray[x] > myArray[maxIndex])
                  maxIndex = x;
            temp = myArray[myArray.length - pass - 1];
            myArray[myArray.length - pass - 1] = myArray[maxIndex];
            myArray[maxIndex] = temp;
            pass++;
         }
         System.out.println(Arrays.toString(myArray));
         /*********************************
      	*   write your code here
      	*
      	*********************************/
      			  
      	//output
         
         
      	
      }
      private static int findMax(double[] arr){
         int pos = 0;
         for (int i = 0; i < arr.length; i++)
            if (arr[i] > arr[pos])
               pos = i;
         return pos;
      }
   }