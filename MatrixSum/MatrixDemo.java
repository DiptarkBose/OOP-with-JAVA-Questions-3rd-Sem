import java.util.*;
class IndividualRow implements Runnable
{
    Thread t;
    Sum o=new Sum();
    int a[];
    IndividualRow(int arr[])
    {
        t=new Thread(this, "Demo");
        a=arr;
        t.start();
    }
    public void run()
    {
        o.sumRow(a);
    }
}
class Sum
{
    static int totalSum=0, rowNum=0;
    int sum, i;
    synchronized void sumRow(int a[])
    {
        sum=0;
        for(i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of Row" +(++rowNum)+": "+sum);
        totalSum=totalSum+sum;
    }
    synchronized int getTotal()
    {
        return totalSum;
    }
}
public class MatrixDemo
{
    public static void main(String args[])
    {
        IndividualRow obj[]=new IndividualRow[2];
        Sum o= new Sum();
        int n;
        System.out.print("Enter Dimension ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("\nEnter Elements:");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[j]=sc.nextInt();
                
            }
            obj[i] = new IndividualRow(a);
        }
        System.out.println("The total sum is: "+o.getTotal());
        //System.out.println("The total sum is: "+o.getTotal());
    }
}
            