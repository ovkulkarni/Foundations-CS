public class Republican extends MazeEscaper implements Runnable
{
   public void run()
   {
      walkDownCurrentSegment(); //you are not at the end at the start
      while(!nextToABeeper())
      {
         turnToTheNextSegment();
         if(!nextToABeeper())
         {
            walkDownCurrentSegment();
         }
      }
   }
   public void walkDownCurrentSegment()
   {
      
      if(!rightIsClear() && frontIsClear())
      {
         move();
      }
   
   }
   public void turnToTheNextSegment()
   {
      if (rightIsClear())
      {
         turnRight();
         move();
      }
      else
      {
         turnLeft();
      }
   }
   
}