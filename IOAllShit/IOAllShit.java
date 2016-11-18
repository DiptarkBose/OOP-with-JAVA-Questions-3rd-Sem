import java.io.*;
class IOAllShit
{
    public static void main(String args[])
    {
        FileInputStream fin=null;
        //FileOutputStream fout=null;
        try
        {
            fin=new FileInputStream("D:\\test.txt");
            //fout=new FileOutputStream("D:\\test.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Accessible");
        }
        
        int i;
      
        try
        {
            
            do{
                i=fin.read();
                if(i!=-1)
                System.out.print((char)i);
                
            }while(i!=-1);
        }
        
       catch(IOException e)
        {
            System.out.println("Error ho gaya bc!");
        }
       
       //byte by[]=msg.getBytes();
        
        /*try
        {
            BufferedWriter bf=new BufferedWriter(new FileWriter("D:\\test.txt"));
            bf.write(msg);
        }
        catch(IOException e)
        {
            System.out.println("Error ho gaya bc!");
        }*/
    }
}