/**
 * Example from programming hub.
 */
public class pattern3
{
    public static void main (String args[])
    {
        int i, j, k;
        for(i=1; i<6; i++)
        {
            for(j=0; j<i; j++)
            {
                System.out.print ("*");
            }
            for(k=1; k<(11-(2*i)); k++)
            {
                System.out.print (" ");
            }
            for(j=0; j<i; j++)
            {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}
                