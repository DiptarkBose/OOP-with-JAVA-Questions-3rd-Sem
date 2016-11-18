class Box
{
    double length;
    double breadth;
    double height;
}
class BoxDemo
{
    public static void main(String args[])
    {
    Box mybox= new Box();
    double vol;
    mybox.length= 10;
    mybox.breadth=12;
    mybox.height=13;
    vol=(mybox.length * mybox.breadth * mybox.height);
    System.out.println ("Volume is : " + vol);
}
}