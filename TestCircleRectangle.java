package Inheritance;
public class TestCircleRectangle
{
  public static void main(String[] args)
  {
    CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
    RectangleFromSimpleGeometricObject rec1 = new RectangleFromSimpleGeometricObject(5,10,"Blue",true);
    
    System.out.println("A rectangle "+rec1.toString());
    System.out.println("The color is "+rec1.getColor());
    System.out.println("The area is "+rec1.getArea());
    System.out.println("The getPerimeter is "+rec1.getPerimeter());
    
    
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The diameter is " + circle.getDiameter());
    
    RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
    System.out.println("\nA rectangle " + rectangle.toString());
    System.out.println("The area is " + rectangle.getArea());
    System.out.println("The perimeter is " + 
      rectangle.getPerimeter());
  }
}

//pearson's rights 
//Y.Daniel Liang 
