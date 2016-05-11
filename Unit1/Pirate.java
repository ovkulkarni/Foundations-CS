	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003

import edu.fcps.karel2.Display;
public class Pirate extends Athlete
{
   public Pirate()
   {
      super(1,1,Display.EAST,0);
   }
   public void approachPile()
   {
      while(!nextToABeeper())
      {
         move();
      }
   }
   public int numOfBeepersInPile()
   {
      int count = 0;
      while(nextToABeeper())
      {
         pickBeeper();
         count++;
      }
      return count;
   }
   public void turnAppropriately(int beepers)
   {
      switch(beepers)
      {
         case 1: turnLeft();
            break;
         case 2: turnAround();
            break;
         case 3: turnRight();
            break;
         default: move();
            break;
      
      }
   }
}