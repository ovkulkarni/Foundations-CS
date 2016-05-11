public class Square extends Rectangle
{
  public Square(double x)
  {
    super(x, x);
  }
  
  public double getSide()
  {
    return getBase();
  }
  
  public void setSide(double x)
  {
    setBase(x);
    setHeight(x);
  }
}
