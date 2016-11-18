/**
 * Generates a funny binary pattern
 */
public class pattern1
{
    public static void main (String args[])
    {
       int i, j;
        for(i=0; i<6; i++)
        {
            for(j=0; j<(i+1); j++)
            {
              if((j%2)==0)
              {
                  System.out.print (" " + 1);
                }
                else
                System.out.print (" " + 0);
            }
            System.out.println(" ");
        }
    }
}
                