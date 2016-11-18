class Box
{
    double length;
    double breadth; 
    double height;
    Box()
    {
        length=10;
        breadth=10;
        height=10;
    }
    // Overloading the above constructor
    Box(double l, double b, double h)
    {
        length=l;
        breadth=b;
        height=h;
    }
}