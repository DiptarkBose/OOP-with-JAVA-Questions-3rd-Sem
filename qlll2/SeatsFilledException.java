
public class SeatsFilledException extends Exception
{
    int excess;
    public SeatsFilledException(int reg)
    {
        excess=(reg%100)-25;
        System.out.println("Inside Exception, won't create object: "+excess);
    }
}
