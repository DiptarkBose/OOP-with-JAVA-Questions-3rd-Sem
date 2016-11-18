class papa
{
    protected int x;
    papa()
    {
        x=40;
    }
    papa(int y)
    {
        x=y;
    }
}
public class son extends papa
{
    protected int x=20;
    son()
    {
        super(15);
    }
    son(int x)
    {}
    public static void main(String args[])
    {
        son s=new son();
        System.out.println(s.x+" ");
        papa t=new son(2);
        System.out.println(t.x);
    }
}
        