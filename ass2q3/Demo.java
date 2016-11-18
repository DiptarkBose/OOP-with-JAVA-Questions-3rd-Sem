import java.util.*;

class Point
{
   int x;
   int y;
}
class Circle extends Point
{
    int radius;
    Circle(int r)
    {
        radius=r;
    }
    public double getArea(int radius)
    {
        double area;
        area=3.14*(radius*radius);
        return area;
    }
}
class Cylinder extends Circle
{
   int height;
    Cylinder(int r, int h)
   {
       super(r);
       height=h;
    }
   public double getVolume(int radius, int height)
   {
       double volume;
       volume=(getArea(radius)*height);
       return volume;
   }
   
   public double getSA(int radius, int height)
   {
       double sa;
       sa=(2*3.14*radius*height)+2*(getArea(radius));
       return sa;
   }
}
public class Demo
{
    public static void main(String args[])
    {
    System.out.print("Enter radius: ");
    int r, h;
    Scanner input= new Scanner(System.in);
    r=input.nextInt();
    Circle c= new Circle(r);
    
    double area= c.getArea(r);
    System.out.println("Area of circle: "+ area);
    System.out.print("Enter radius and height: ");
    r=input.nextInt();
    h=input.nextInt();
    
    Cylinder cy = new Cylinder(r, h);
    double volume= cy.getVolume(r, h);
    System.out.println("Volume of cylinder: "+ volume);
    
    double sa= cy.getSA(r, h);
    System.out.println("SA of cylinder: "+ sa);
}
}
