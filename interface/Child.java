import java.util.*;
interface Dad
{
    public void callDad();
}
class Mom
{
    static void callMom()
    {
        System.out.println("Inherited this trait from my mom");
    }
}
public class Child extends Mom 
{
    public static void main(String args[])
    {
       //public void callDad()
        {
            System.out.println("Inherited this trait from my dad");
        }
        callMom();
    }
}