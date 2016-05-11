public class Rectangle extends Shape
{
  private double myBase;
  private double myHeight;
  
  public Rectangle(double x, double y)
  {
    this.myBase = x;
    this.myHeight = y;
  }
  
  public double getBase()
  {
    return this.myBase;
  }
  
  public double getHeight()
  {
    return this.myHeight;
  }
  
  public void setBase(double x)
  {
    this.myBase = x;
  }
  
  public void setHeight(double x)
  {
    this.myHeight = x;
  }
  
  public double findArea()
  {
    return this.myBase * this.myHeight;
  }
  
  public double findPerimeter()
  {
    return 2.0 * this.myBase + 2.0 * this.myHeight;
  }
  
  public double findDiagonal()
  {
    return Math.sqrt(this.myBase * this.myBase + this.myHeight * this.myHeight);
  }
}
