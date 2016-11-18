class BoxDemo
{
    public static void main (String args[])
    {
        Box mybox= new Box(20, 30, 90);
        double vol;
        vol= mybox.length * mybox.height * mybox.breadth;
        System.out.println ("The volume is : " + vol);
    }
}