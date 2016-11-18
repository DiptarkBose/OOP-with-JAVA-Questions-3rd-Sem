class MakeThread extends Thread
{
    Mult obj;
    int no;
    MakeThread(String s, Mult o, int n)
    {
        super(s);
        obj=o;
        no=n;
        start();
    }
    public void run()
    {
        obj.multiply(no);
    }
    
}
class Mult
{
    synchronized void multiply(int n)
    {
       try
            {
                for (int i=1; i<=10; i++)
                {
                    System.out.println(n+" * "+ i+ " = " + (n*i));
                    
                    
                }
            }
            catch(Exception e)
            {
            }
    }
}

public class RunThreads
{
    public static void main(String args[])
    {
        Mult ob=new Mult();
        MakeThread obj1= new MakeThread("five", ob, 5);
        MakeThread obj2=new MakeThread("seven", ob, 7);
    }
}