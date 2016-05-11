/**************************************************************
*A Rectangle is a Shape that has 4 sides. It has information about it's height and base.
*It can also find its area, diagonal, and perimeter.

* @author Omkar Kulkarni, email: okulkarni@okulkarni.cf
* @version 2.29.2016
**************************************************************/

public class Rectangle extends Shape
{
  private double myBase;
  private double myHeight;
  
  /*********************************************
  * Constructs a rectangle with base x and height y
  * @param x base of rectangle
  * @param y height of rectangle
  *********************************************/
  public Rectangle(double x, double y)
  {
    myBase = x;
    myHeight = y;
  }
  /*********************************************
  * Returns base of rectangle
  * @return base of rectangle
  *********************************************/
  public double getBase()
  {
    return myBase;
  }
  /*********************************************
  * Returns height of rectangle
  * @return height of rectangle
  *********************************************/
  public double getHeight()
  {
    return myHeight;
  }
  /*********************************************
  * Sets base of rectangle
  * @param x base length of rectangle
  *********************************************/
  public void setBase(double x)
  {
    myBase = x;
  }
  /*********************************************
  * Sets height of rectangle
  * @param x height of rectangle
  *********************************************/  
  public void setHeight(double x)
  {
    myHeight = x;
  }
  /*********************************************
  * Returns area of rectangle
  * @return area of rectangle
  *********************************************/  
  public double findArea()
  {
    return myBase * myHeight;
  }
  /*********************************************
  * Returns perimeter of rectangle
  * @return perimeter of rectangle
  *********************************************/   
  public double findPerimeter()
  {
    return 2.0 * myBase + 2.0 * myHeight;
  }
  /*********************************************
  * Returns diagonal of rectangle
  * @return diagonal of rectangle
  *********************************************/  
  public double findDiagonal()
  {
    return Math.sqrt(myBase * myBase + myHeight * myHeight);
  }
}
