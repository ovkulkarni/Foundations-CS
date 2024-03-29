	//Name______________________________ Date_____________
  

import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Comparator;
public class Driver07
{
   public static void main(String[] args)
   {
      Salesperson[] array = input("data.txt");
      menu(array);
      System.exit(0);
   }
    
   public static Salesperson[] input(String filename)
   {    
      Scanner infile = null;
      try{
         infile = new Scanner(new File(filename));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be found.");
         System.exit(0);
      }
      int numitems = infile.nextInt();
      Salesperson[] array = new Salesperson[numitems];
      for(int k = 0; k < numitems; k++)
      {
         String a = infile.next();
         int b = infile.nextInt();
         int c = infile.nextInt();
         array[k] = new Salesperson(a, b, c);
      }
      infile.close();
      return array;
   }
   	
   public static void menu(Salesperson[]array)
   {
      int choice = 0;
      while(choice != 7)
      {
         String message = "";
         message = message + "\n1. List Alphabetically.";
         message = message + "\n2. List by Cars Sold.";
         message = message + "\n3. List by Trucks Sold.";
         message = message + "\n4. List by Total Sales.";
         message = message + "\n5. Add Sales.";
         message = message + "\n6. Save data to file.";
         message = message + "\n7. Quit.";
         choice = Integer.parseInt(JOptionPane.showInputDialog(message));
         switch(choice)
         {
            case 1: display(array, new ByName());
               break;
            case 2: display(array, new ByCars());
               break;
            case 3: display(array, new ByTrucks());
               break;
            case 4: display(array, new ByTotalSales());
               break;
            case 5: add(array);
               break;
            case 6: save(array);
               break;
            case 7: 
               for(int k = 0; k < 25; k++) 
                  System.out.println();
               System.out.println("Bye-bye!");
               break;
            default: System.out.println("Not a valid selection.");
               break;
         }
         System.out.println();
      }
   }
    
   public static void save(Salesperson[] array)
   {
      PrintStream outfile = null;
      try{
         outfile = new PrintStream(new FileOutputStream("data.txt"));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"The file could not be created.");
      }
      outfile.println(array.length);
      for (int k = 0; k < array.length; k++) {
         outfile.println(array[k].getName() + "\n" + array[k].getCars() + "\n" + array[k].getTrucks());
      }
      outfile.close();
      System.out.println("Saved.");
   }
   public static void add(Salesperson[] array)
   {	
      int pos;
      do
      {
         String name = JOptionPane.showInputDialog("What salesperson?");
         pos = search(array, name);
      } while (pos == -1);
      String type;
      do
      {
         type = JOptionPane.showInputDialog("Cars or Trucks?");
         type = type.toLowerCase();
      } while ((!type.equals("cars")) && (!type.equals("trucks")));
      int amount;
      do
      {
         amount = Integer.parseInt(JOptionPane.showInputDialog("How many " + type + "?"));
      } while (amount <= 0);
      if (type.equals("cars")) {
         array[pos].setCars(array[pos].getCars() + amount);
      } 
      else {
         array[pos].setTrucks(array[pos].getTrucks() + amount);
      }
         	/************************/
      System.out.println("Sales added.");
   }
   public static int search(Salesperson[] array, String name)
   {
      for (int k = 0; k < array.length; k++) {
         if (name.equals(array[k].getName())) {
            return k;
         }
      }
      return -1;
           //in order to compile
   }
   public static void display(Salesperson[] array, Comparator c)
   {
      sort(array, c);
      for (int k = 0; k < 25; k++) {
         System.out.println();
      }
      System.out.println("Name\tCars\tTrucks\tTotal");
      System.out.println("-----------------------------");
      for (int k = 0; k < array.length; k++) {
         System.out.println(array[k].getName() + "\t" + array[k].getCars() + "\t" + array[k].getTrucks() + "\t" + (array[k].getCars() + array[k].getTrucks()));
      }
   }
   public static void sort(Object[] array, Comparator c)
   {
      int minPos;
      for(int k = 0; k < array.length; k++)
      {
         minPos = findMin(array, array.length - k, c);
         swap(array, minPos, array.length - k - 1);
      }
   }
   public static int findMin(Object[] array, int upper, Comparator c)
   {
      int minPos = 0;
      for (int j = 1; j < upper; j++) {
         if (c.compare(array[j], array[minPos]) < 0) {
            minPos = j;
         }
      }
      return minPos;
   }
   public static void swap(Object[] array, int a, int b)
   {
      Object temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
}