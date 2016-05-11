//Name______________________________ Date_____________

public class Song implements Comparable<Song>
{
   private String myTitle;
   private int myMinutes, mySeconds;
     
   public Song()
   {
      myTitle = "";
      myMinutes = (mySeconds = 0);
   }
     
   public Song(String toBeParsed)
   {
      int colon = toBeParsed.indexOf(":");
      int m = Integer.parseInt(toBeParsed.substring(0, colon));
      myMinutes = m;
      int s = Integer.parseInt(toBeParsed.substring(colon + 1, colon + 3));
      mySeconds = s;
      myTitle = toBeParsed.substring(colon + 4, toBeParsed.length());
   }
     
   public Song(Song arg)
   {
      myTitle = arg.getTitle();
      myMinutes = arg.getMinutes();
      mySeconds = arg.getSeconds();
   }
     
   public String getTitle()
   {
      return myTitle;
   }
     
   public int getMinutes()
   {
      return myMinutes;
   }
     
   public int getSeconds()
   {
      return mySeconds;
   }
     
   public int getTotalTime()
   {
      return myMinutes * 60 + mySeconds;
   }
     
   public int compareTo(Song arg)
   {
      if (getTotalTime() < arg.getTotalTime()) {
         return -1;
      }
      if (getTotalTime() > arg.getTotalTime()) {
         return 1;
      }
      return 0;
   }
     
   public boolean equals(Song arg)
   {
      return compareTo(arg) == 0;
   }
     
   public String toString()
   {
      return myTitle + " (" + myMinutes + "' " + mySeconds + "\")";
   }   	
}