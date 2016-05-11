import java.io.*;
import java.util.*;
import javax.swing.*;

public class Driver08
{
  public static void main(String[] args)
    throws Exception
  {
    Scanner infile = new Scanner(new File("words.txt"));
    
    int numitems = infile.nextInt();
    String[] wordlist = new String[numitems];
    for (int x = 0; x < numitems; x++) {
      wordlist[x] = infile.next();
    }
    infile.close();
    for (;;)
    {
      String s = JOptionPane.showInputDialog("Word? (Type -1 to quit.)");
      if (s.equals("-1")) {
        break;
      }
      int flag = 0;
      for (int x = 0; x < numitems; x++) {
        if (s.equalsIgnoreCase(wordlist[x]))
        {
          System.out.println("Yes, \"" + s + "\" is a word, #" + (x + 1) + ".");
          
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println("Sorry, \"" + s + "\" is not a word.");
      }
    }
    System.out.println("Good-bye.");
    System.exit(0);
  }
}
