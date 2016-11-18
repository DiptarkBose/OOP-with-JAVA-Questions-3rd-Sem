class GenAvg<T extends Number>
{
    T ob[];
    GenAvg(T o[])
    {
        ob=o;
    }
    public double getAverage()
    {
        double sum=0.0;
        for(int i=0; i<ob.length; i++)
        {
            sum=sum+ob[i].doubleValue();
            
        }
        return (sum/ob.length);
    }
    boolean compare(GenAvg<?> ob2)
    {
        if(getAverage()==ob2.getAverage())
            return true;
        else
            return false;
    }
}