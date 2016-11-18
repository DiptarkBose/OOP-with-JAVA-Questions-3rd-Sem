import java.io.*;
class ShowFile
{
    public static void main(String args[])throws Exception
    {
        //File f=new File("D:\\test.txt");
        FileInputStream fin=null;
        //FileWriter fout=null;
        BufferedWriter bf=new BufferedWriter(new FileWriter("D:\\test.txt"));
        String msg="Bose madarchod";
        bf.write(msg);
        bf.close();
        int i;
        if(args.length!=1){
            System.out.println("Not Working");
            //return;
        }
       /* try
        {
            fout=new FileWriter("D:\\test.txt");
        }
        catch(IOException e)
        {
            System.out.println("Cannot Access");
        }
        try {       
            fout.write(msg);   
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
            return; // <<== Here
        }
        catch(IOException e) {   
            System.out.println("Error Reading File");    
        }
        /*try {       
            //fin.close();     
        } 
        catch(IOException e) {    
            System.out.println("Error Closing File");     
        } */ 
    } 
}