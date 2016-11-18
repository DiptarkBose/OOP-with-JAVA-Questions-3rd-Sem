public class backhanded
{
    int state =0;
    backhanded (int s)
    {
        state=s;
    }
    public static void main(String args[])
    {
        backhanded b1=new backhanded(1);
        backhanded b2=new backhanded(2);
        System.out.println(b1.go(b1)+" "+b2.go(b2));
    }
    int go(backhanded b)
    {
        if(this.state==2)
        {
            b.state=5;
            go(this);
        }
        return ++this.state;
    }
}
        
    