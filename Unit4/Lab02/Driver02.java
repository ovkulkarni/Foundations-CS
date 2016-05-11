//Omkar Kulkarni
import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver02
{
  public static final int NUMITEMS = 15;
  public static final DecimalFormat sigdigits = new DecimalFormat("0.0");
  
  public static void main(String[] args)
  {
    double[] celsius = new double[15];
    double[] fahrenheit = new double[15];
    Scanner keyboard = new Scanner(System.in);
    for (int x = 0; x < 10; x++)
    {
      System.out.print("#" + (x + 1) + " - Degrees Fahrenheit: ");
      fahrenheit[x] = keyboard.nextDouble();
    }
    for (int x = 10; x < 15; x++)
    {
      fahrenheit[x] = ((int)(Math.random() * 10000.0) / 10.0);
      System.out.println("#" + (x + 1) + " - Degrees Fahrenheit: " + fahrenheit[x]);
    }
    for (int x = 0; x < 15; x++) {
      celsius[x] = ((fahrenheit[x] - 32.0) * 5.0 / 9.0);
    }
    System.out.println("\nFahrenheit\t\t| Celsius");
    System.out.println("--------------------|--------------------");
    for (int x = 0; x < 15; x++) {
      System.out.println(sigdigits.format(fahrenheit[x]) + "\t\t| " + sigdigits.format(celsius[x]));
    }
  }
}