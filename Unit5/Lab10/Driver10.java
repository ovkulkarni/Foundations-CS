  //Name______________________________ Date_____________
  
import java.io.*;       		 //the File class
import java.util.*;     		 //the Scanner class
import javax.swing.JOptionPane;
public class Driver10
{
   public static void main(String[] args) 
   {
      Song[] songList = input();
      int totalTime = calcTime(songList);
      int longestSong = searchLongestSong(songList);
      display(songList, totalTime, longestSong);
      System.exit(0);
   }
   	
   public static Song[] input() 
   {
      Scanner infile = null;
      while (infile == null) {
         try
         {
            String filename = JOptionPane.showInputDialog("Which file should I use?");
            infile = new Scanner(new File(filename));
         }
         catch (FileNotFoundException e)
         {
            JOptionPane.showMessageDialog(null, "The file could not be found.");
         }
      }
      int numitems = Integer.parseInt(infile.nextLine());
      Song[] songArray = new Song[numitems];
      for (int k = 0; k < numitems; k++)
      {
         String line = infile.nextLine();
         songArray[k] = new Song(line);
      }
      infile.close();
      return songArray;
   }
   
   public static int calcTime(Song[] songs)
   {
      int time = 0;
      for (int k = 0; k < songs.length; k++) {
         time += songs[k].getTotalTime();
      }
      return time;
   }
      
   public static int searchLongestSong(Comparable[] songs)
   {
      int maxPos = 0;
      for (int k = 1; k < songs.length; k++) {
         if (songs[k].compareTo(songs[maxPos]) > 0) {
            maxPos = k;
         }
      }
      return maxPos;
   }
      
   public static void display(Song[] array, int total, int longestSong)
   {
      System.out.println("Total Time: " + total / 60 + "' " + total % 60 + '"');
      System.out.println("Longest Song: " + array[longestSong].toString());
   }
}