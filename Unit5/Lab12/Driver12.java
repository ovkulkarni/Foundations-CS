	//Name______________________________ Date_____________
import java.io.*;
import javax.swing.*;
public class Driver12
{
   public static void main(String[] args) throws Exception
   {
      String folder = JOptionPane.showInputDialog("Complete path of folder:");
      String filename = "";
      for(int k = 0; k < folder.length(); k++)
      {
         char ch = folder.charAt(k);
         if(Character.isLetterOrDigit(ch))
            filename = filename + ch;
         else
            filename = filename + '_';
      }
      System.setOut(new PrintStream(new FileOutputStream(filename + ".txt")));
   
      foo(new File(folder));
   
      System.exit(0);
   }
   public static void foo(File f)
   {
      if(f.isDirectory()){
         File[] array = f.listFiles();
         for(int i = 0; i < array.length; i++)
            foo(array[i]);
      }
      else
         System.out.println(f.getPath());      
   }
}