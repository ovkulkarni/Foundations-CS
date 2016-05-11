	/*****************************************************************
	* A Circle is a Shape that maintains information about its radius. A Circle
	* knows how to return its radius, set its radius, calculate and return its 
	* area, and calculate and return its circumference.
	 
	* @author 
	* @version 
	****************************************************************/
public class Circle extends Shape
{
  private double myRadius;
  
  public Circle(double x)
  {
    this.myRadius = x;
  }
  
  public double getRadius()
  {
    return this.myRadius;
  }
  
  public void setRadius(double x)
  {
    this.myRadius = x;
  }
  
  public double findArea()
  {
    return 3.141592653589793 * Math.pow(this.myRadius, 2.0);
  }
  
  public double findCircumference()
  {
    return 6.283185307179586 * this.myRadius;
  }
}
