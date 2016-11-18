public class GenStack<T>
{
    int tos;
    T arr[];
    GenStack()
    {
        tos=-1;
        arr=(T[])new Object[30];
    }
    public void push(T ob)
    {
        arr[++tos]=ob;
    }
    public T pop()
    {
        return arr[tos--];
    }
    public void display()
    {
        int i;
        for(i=0; i<=tos; i++)
        {
            System.out.println(arr[i]+"\t");
        }
    }
}
