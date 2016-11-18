class ExchangeDemo
{
    public static void main(String args[])
    {
        Integer arr[]={1, 2, 3, 4};
        Exchange<Integer> ob=new Exchange<Integer>(arr);
        ob.exchange(1, 3);
        ob.display();
    }
}