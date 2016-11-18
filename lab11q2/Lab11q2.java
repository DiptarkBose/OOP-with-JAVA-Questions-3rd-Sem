import java.awt.*;
import java.applet.*;
import java.util.*;
/*<applet code="Lab11q2" height=200 width=100>
  </applet>
*/
public class Lab11q2 extends Applet
{
    int n=10;
    public void init()
    {
        setBackground(Color.black);
    }
    public void start()
    {
        
    }
    public void paint(Graphics g)
    {
       int i;
       g.setColor(Color.red);
       for(i=1; i<=n; i++)
            g.drawString((""+n*i), 10, (30*i));
    }
}
        
        
        