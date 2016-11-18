
public class Student
{
    int registration;
    int yoj;
    Student(int reg, int yo) throws SeatsFilledException
    {
        
        if(reg>((yo%100)+25))
        {
            SeatsFilledException obj=new SeatsFilledException(reg);
            throw obj;
        }
        else
        {
            registration=reg;
            yoj=yo;
            System.out.println("New Student Created");
        }
    }
}
