/**
 * Two D Array working
 */
public class twodarr
{
    public static void main (String args[])
    {
        int twodarr[][]= new int[4][5];
        int i, j, k=0;
        for(i=0; i<4; i++)
        {
            for(j=0; j<5; j++)
            {
                twodarr[i][j]=k;
                k++;
            }
        }
        for(i=0; i<4; i++)
        {
            System.out.println(" ");
            for(j=0; j<5; j++)
            {
                System.out.print (" " + twodarr[i][j]);
            }
        }
    }
}
        