	//Name______________________________ Date_____________
public class Salesperson 
{
   	//data fields
   private String myName;
   private int myCars, myTrucks;
   
   public Salesperson()
   {
      myName = "John";
      myCars = 0;
      myTrucks = 0;
   }
   
   public Salesperson(int x)
   {
      myName = "John";
      myCars = x;
      myTrucks = 0;
   }
   
   public Salesperson(String s, int x, int y)
   {
      myName = s;
      myCars = x;
      myTrucks = y;
   }
   
   public Salesperson(Salesperson arg)
   {
      myName = arg.getName();
      myCars = arg.getCars();
      myTrucks = arg.getTrucks();
   }
   
   public int getCars()
   {
      return myCars;
   }
   
   public int getTrucks()
   {
      return myTrucks;
   }
   
   public String getName()
   {
      return myName;
   }
   
   public int getSales()
   {
      return myCars + myTrucks;
   }   
   
   public void setName(String s)
   {
      myName = s;
   }   
   
   public void setCars(int x)
   {
      myCars = x;
   }
   
   public void setTrucks(int x)
   {
      myTrucks = x;
   }
   
   
   public String toString()
   {
      return myCars + " cars " + myTrucks + " trucks";
   }
}
