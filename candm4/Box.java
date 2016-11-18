class Box
{
    double length, breadth, height;
    void SetDimensions( double l, double b, double h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    void volume()
    {
         System.out.println ("The volume of this box is : " +(length*breadth*height));
    }
}