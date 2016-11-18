import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
    public void display()
    {
        System.out.print("\t"+data);
    }
}
class LinkedList
{
    Node list;
    LinkedList()
    {
        list=null;
    }
    public void add_rear(Node temp)
    {
        if(list==null)
        {
            list=temp;
        }
        else
        {
            Node p;
            p=list;
            while(p.next!=null)
                p=p.next;
            p.next=temp;
        }
    }
    public void displayLL()
    {
        Node cur=list;
        while(cur!=null)
        {
            cur.display();
            cur=cur.next;
        }
        
    }
            
}
public class LinkedListDemo
{
    public static void main(String args[])
    {
        System.out.println("Enter your choice:\n");
        Scanner in=new Scanner(System.in);
        LinkedList list=new LinkedList();
        Node d;
        int n;
        do
        {
            System.out.println("1. Insert\n2. Delete\n3. Display\n4. Display\n\n");
            n=in.nextInt();
            if(n==1)
            {   
                System.out.println("Enter element: ");
                n=in.nextInt();
                d=new Node(n);
                list.add_rear(d);
            }
            else if(n==2)
            {
               // list.delete();
            }
            else if(n==3)
            {
               list.displayLL();
            }
        }while(n!=4);
    }
}
            