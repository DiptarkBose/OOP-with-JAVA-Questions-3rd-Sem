/**
 * Generates another funny pattern
 */
public class pattern2
{
    public static void main (String args[])
    {
        int i, j;
        for(i=0; i<6; i++)
        {
            if(i%2==0)
            {
                for(j=0; j<(i+1); j++)
                {
                    if(j%2==0)
                    {
                        System.out.print (" " + 1);
                    }
                    else
                    {
                        System.out.print (" " + 0);
                    }
                }
            }
            else
            {
                for(j=0; j<(i+1); j++)
                {
                    if(j%2==0)
                    {
                        System.out.print (" " + 0);
                    }
                    else
                    {
                        System.out.print (" " + 1);
                    }
                }
            }
            System.out.println (" ");
        }
    }
}
                