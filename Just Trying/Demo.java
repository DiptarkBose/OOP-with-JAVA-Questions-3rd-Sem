import java.util.*;
public class Demo
{
    public void meth()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught");
            throw e;
        }
    }
    public static void main(String args[])
    {
        Demo obj=new Demo();
        obj.meth();
    }
}