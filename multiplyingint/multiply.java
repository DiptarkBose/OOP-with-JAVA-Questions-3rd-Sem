//This program multiplies 2 integers, after taking input from the user
import comp102x.IO;
public class multiply
{
    public static void main (String[] args)
    {
        System.out.println("Enter first integer");
        int num1=IO.inputInteger();
        System.out.println ("Enter second integer :");
        int num2=IO.inputInteger();
        int product;
        product= num1*num2;
        IO.outputln ("The product of the given numbers is :" + product);
    }
}
