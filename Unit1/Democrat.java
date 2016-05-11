public class Democrat extends MazeEscaper implements Runnable
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
      
      if(!leftIsClear() && frontIsClear())
      {
         move();
      }
   
   }
   public void turnToTheNextSegment()
   {
      if (leftIsClear())
      {
         turnLeft();
         move();
      }
      else
      {
         turnRight();
      }
   }
   
}