/**************************************************************
*A Square is a Rectangle that has 4 equal sides. It has information about it's side length.
* @author Omkar Kulkarni, email: okulkarni@okulkarni.cf
* @version 2.29.2016
**************************************************************/
public class Square extends Rectangle
{
  /*********************************************
  * Constructs a square with side length x
  * @param x side length of square
  *********************************************/
  public Square(double x)
  {
    super(x, x);
  }
  /*********************************************
  * Returns side length of square
  * @return side length of square
  *********************************************/  
  public double getSide()
  {
    return getBase();
  }
  /*********************************************
  * Sets side length of square
  * @param x side length of square
  *********************************************/  
  public void setSide(double x)
  {
    setBase(x);
    setHeight(x);
  }
}
