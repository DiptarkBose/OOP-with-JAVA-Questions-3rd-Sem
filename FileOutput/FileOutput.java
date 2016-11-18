import java.io.*;
class FileOutput
{
    public static void main(String args[])
    {
        FileOutputStream fout=null;
        try
        {
            fout=new FileOutputStream("D:\\test.txt");
        }
        catch(FileNotFoundException e)
        {
        }
        String msg="lol";
        int i;
        byte by[]=msg.getBytes();
        try
        {
            for(i=0; i<by.length; i++)
                fout.write(by[i]);
        }
        catch(IOException e)
        {
        }
        
    }
}
        