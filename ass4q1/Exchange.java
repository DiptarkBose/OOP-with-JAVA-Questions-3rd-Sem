class Exchange<T>
{
    T arr[];
    Exchange(T a[])
    {
        arr=a;
    }
    public void exchange(int a, int b)
    {
        T temp;
        temp=arr[a-1];
        arr[a-1]=arr[b-1];
        arr[b-1]=temp;
    }
    public void display()
    {
        int i;
        for(i=0; i<arr.length; i++)
        {
            System.out.println("\t"+arr[i]);
        }
    }
}
    