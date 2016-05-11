import edu.fcps.Digit;
import edu.fcps.karel2.Display;

public class TestDigits
{
   public static void main(String[] args)
   {
      Display.setSize(75, 75);
      Display.setSpeed(10);
      
      Digit first = new One(1, 9);
      Digit second = new Two(9, 9);
      Digit third = new Three(17, 9);
      Digit fourth = new Four(25, 9);
      Digit fifth = new Five(33, 9);
      Digit sixth = new Six(41, 9);
      Digit seventh = new Seven(49,9);
      Digit eighth = new Eight(57,9);
      Digit ninth = new Nine(65,9);
      Digit tenth = new Zero(73,9);
      
      first.display();
      second.display();
      third.display();
      fourth.display();
      fifth.display();
      sixth.display();
      seventh.display();
      eighth.display();
      ninth.display();
      tenth.display();
   }
}
