import edu.fcps.Digit;
import edu.fcps.karel2.Display;

public class Lab11
{
  public static void main(String[] args)
  {
    Display.setSize(49, 49);
    Display.setSpeed(10);
    
    Digit first = new One(1, 9);
    Digit second = new Six(8, 9);
    Digit third = new Seven(15, 9);
    Digit fourth = new Seven(22, 9);
    Digit fifth = new Four(29, 9);
    Digit sixth = new Nine(36, 9);
    Digit seventh = new Five(43,9);
    
    first.display();
    second.display();
    third.display();
    fourth.display();
    fifth.display();
    sixth.display();
    seventh.display();
  }
}
