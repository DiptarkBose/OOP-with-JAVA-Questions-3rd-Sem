import java.util.*;
import java.io.*;
class Node<T>
{
    T data;
    Node<T> next;
    Node(T d)
    {
        data=d;
        next=null;
    }
}
class Linked_List<T>
{
    Node<T> list;
    Linked_List()
    {
        list=null;
    }
    public void add(Node<T> temp)
    {
        
        if(list==null)
            list=temp;
        else
        {
            Node p;
            p=list;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
    }
    public void display()
    {
        Node p=list;
        while(p!=null)
            {
                System.out.println(p.data+"\t");
                p=p.next;
            }
    }
}
public class Linked_List_Demo
{
    public static void main(String args[])
    {
        System.out.println("Enter Operation:\n");
        Scanner sc=new Scanner(System.in);
        Linked_List<Integer> obj=new Linked_List<Integer>();
        int n, da;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
           System.out.println("1. Insert\n2. Display\n");
           n=sc.nextInt();
           Node<Integer> dabba=null;
           if(n==1)
           {
               System.out.println("Enter data");
               try
               {
                   dabba=new Node(Integer.parseInt(br.readLine()));
               }
               catch(Exception e)
               {
                }
               obj.add(dabba);
           }
           else
           {
               obj.display();
           }
        }
    }
}
            