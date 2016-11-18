import java.awt.*;
import java.applet.*;
import java.util.*;
/*<applet code="Lab11q3" height=300 width=300>
  </applet>
*/
public class Lab11q3 extends Applet implements Runnable
{
    int n=0;
    String msg="Just a Banner Program";
    Thread t=null;
    public void init()
    {
        setBackground(Color.black);
    }
    public void start()
    {
        t=new Thread(this);
        t.start();
        
        
    }
    public void run()
    {
       while(true)
       {
           n++;
           if(n==300)
           n=0;
           try
           {
               t.sleep(100);
            }catch(Exception e)
            {}            
           repaint();
        }
    }
    public void paint(Graphics g)
    {
       g.setColor(Color.red);
           g.drawString((msg), n, 60);
          // repaint();
        }
    }