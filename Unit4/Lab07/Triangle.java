public class Triangle extends Shape
{
  private double mySide;
  
  public Triangle(double x)
  {
    this.mySide = x;
  }
  
  public double getSide()
  {
    return this.mySide;
  }
  
  public void setSide(double x)
  {
    this.mySide = x;
  }
  
  public double findArea()
  {
    return this.mySide * this.mySide * Math.sqrt(3.0) / 4.0;
  }
  
  public double findPerimeter()
  {
    return 3.0 * this.mySide;
  }
}
