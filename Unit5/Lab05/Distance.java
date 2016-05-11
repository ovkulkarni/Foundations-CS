public class Distance
  implements Comparable<Distance>
{
   private int myFeet;
   private int myInches;
   
   public Distance()
   {
      myFeet = 0;
      myInches = 0;
   }
   
   public Distance(int x)
   {
      myFeet = x;
      myInches = 0;
   }
   
   public Distance(int x, int y)
   {
      myFeet = x;
      myInches = y;
   }
   
   public Distance(Distance arg)
   {
      myFeet = arg.getFeet();
      myInches = arg.getInches();
   }
   
   public int getFeet()
   {
      return myFeet;
   }
   
   public int getInches()
   {
      return myInches;
   }
   
   public void setFeet(int x)
   {
      myFeet = x;
   }
   
   public void setInches(int x)
   {
      myInches = x;
   }
   
   public int compareTo(Distance w)
   {
      int myTotal = myFeet * 16 + myInches;  //access my data directly 	
      int wTotal = w.getFeet() * 16 + w.getInches(); //use w's get() methods 	
      return myTotal - wTotal;		   //return the difference in ounces
   }
   
   public String toString()
   {
      return myFeet + " ft. " + myInches + " in.";
   }
   public boolean equals(Distance arg)	{
   		
      return compareTo(arg) == 0;	
   }
}

