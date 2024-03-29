public class Weight
  implements Comparable<Weight>
{
  private int myPounds;
  private int myOunces;
  
  public Weight()
  {
    myPounds = (myOunces = 0);
  }
  
  public Weight(int x)
  {
    myPounds = x;
    myOunces = 0;
  }
  
  public Weight(int x, int y)
  {
    myPounds = x;
    myOunces = y;
  }
  
  public Weight(Weight arg)
  {
    myPounds = arg.getPounds();
    myOunces = arg.getOunces();
  }
  
  public int getPounds()
  {
    return myPounds;
  }
  
  public int getOunces()
  {
    return myOunces;
  }
  
  public void setPounds(int x)
  {
    myPounds = x;
  }
  
  public void setOunces(int x)
  {
    myOunces = x;
  }
  
  public int compareTo(Weight w)
  {
    if (myPounds < w.getPounds()) {
      return -1;
    }
    if (myPounds > w.getPounds()) {
      return 1;
    }
    if (myOunces < w.getOunces()) {
      return -1;
    }
    if (myOunces > w.getOunces()) {
      return 1;
    }
    return 0;
  }
  
  public String toString()
  {
    return myPounds + " lbs. " + myOunces + " oz.";
  }
}
