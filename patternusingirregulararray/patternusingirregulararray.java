/**
 * Pattern using irregular array!
 */
public class patternusingirregulararray
{
    public static void main(String args[])
    {
        int i, j;
        int twoD[][]= new int[5][];
        twoD[0]= new int[1];
        twoD[1]= new int[2];
        twoD[2]= new int[3];
        twoD[3]= new int[4];
        twoD[4]= new int[5];
        for(i=0; i<5; i++)
        {
            for(j=0; j<i; j++)
            {
                System.out.print (j);
            }
        }
    }
}

        