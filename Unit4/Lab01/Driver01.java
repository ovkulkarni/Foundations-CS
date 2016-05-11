import java.util.Scanner;

public class Driver01
{
  public static final int NUMITEMS = 10;
  
  public static void main(String[] args)
  {
    double[] array = new double[10];
    Scanner keyboard = new Scanner(System.in);
    for (int x = 0; x < 10; x++)
    {
      System.out.print("#" + (x + 1) + ":  ");
      array[x] = keyboard.nextDouble();
    }
    double sum = 0.0;
    for (int x = 0; x < 10; x++) {
      sum += array[x];
    }
    double avg = sum / 10.0;
    
    double min = array[0];
    double max = array[0];
    for (int x = 1; x < 10; x++)
    {
      min = Math.min(min, array[x]);
      max = Math.max(max, array[x]);
    }
    System.out.println("Sum : " + sum);
    System.out.println("Avg : " + avg);
    System.out.println("Min : " + min);
    System.out.println("Max : " + max);
  }
}