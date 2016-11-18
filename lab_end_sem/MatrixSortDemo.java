import java.util.*;
class MatrixRowThread implements Runnable
{
    int arr[];
    Sort obj;
    MatrixRowThread(int a[])
    {
        arr=a;
        Thread t=new Thread(this, "Individual Row");
        obj=new Sort(arr);
        t.start();
    }
    public void run()
    {
        obj.sort();
    }
}
class Sort
{
    int i, j, temp;
    int arr[];
    Sort(int a[])
    {
        arr=a;
    }
    synchronized public void sort()
    {
        for(i=arr.length-1; i>=0; i--)
        {
            for(j=0; j<i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        display();
    }
    public void display()
    {
       for(i=0; i<arr.length; i++)
       {
           System.out.println(arr[i]+"\t");
        }
    }
}
public class MatrixSortDemo
{
    public static void main(String args[])
    {
        System.out.println("Enter Matrix Dimensions");
        Scanner sc=new Scanner(System.in);
        int i, j, n, m;
        m=sc.nextInt();
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0; i<m; i++)
        {
            System.out.println("Enter contents of row"+(i+1)+": ");
            for(j=0; j<n; j++)
            {
                a[j]=sc.nextInt();
            }
            MatrixRowThread obj=new MatrixRowThread(a);
        }
    }
}
            