//Name______________________________ Date_____________
import java.io.*;

public class Driver07
{
  public static void main(String[] args) throws Exception
  {
    System.setOut(new PrintStream(new FileOutputStream("output.txt")));
    
    Shape[] array = new Shape[(int)(Math.random() * 40.0 + 10.0)];
    for (int x = 0; x < array.length; x++)
    {
      double temp = Math.random() * 100.0;
      switch ((int)(Math.random() * 4.0))
      {
      case 0: 
        array[x] = new Circle(temp);
        break;
      case 1: 
        array[x] = new Square(temp);
        break;
      case 2: 
        array[x] = new Rectangle(temp, Math.random() * 100.0);
        break;
      case 3: 
        array[x] = new Triangle(temp);
        break;
      default: 
        array[x] = null;
      }
    }
    System.out.println("Shapes");
    System.out.println("------");
    for (int x = 0; x < array.length; x++) {
      System.out.println("area = " + array[x].findArea() + "\t\t" + array[x]);
    }
  }
}
