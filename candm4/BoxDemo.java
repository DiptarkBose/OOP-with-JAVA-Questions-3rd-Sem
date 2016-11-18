class BoxDemo
{
    public static void main (String args[])
    {
        Box mybox1= new Box();
        Box mybox2= new Box();
        mybox1.SetDimensions(30, 40, 50);
        mybox2.SetDimensions(10, 20, 60);
        double vol1, vol2;
        mybox1.volume();
        mybox2.volume();
    }
}
    