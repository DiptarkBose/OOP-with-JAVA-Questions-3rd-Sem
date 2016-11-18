import java.applet.*;
import java.awt.*;
/*<applet code="Lab11q1" height=300 width=300>
 * </applet>
 */
public class Lab11q1 extends Applet
{
    String msg;
    public void init()
    {
        setBackground(Color.cyan);
    }
    public void start()
    {
        msg="End Sem di ma di!!";
    }
    
    public void paint(Graphics g)
    {
        msg=msg+"lala";
        g.drawString(msg, 20, 20);
        showStatus("I am a pretty big loser!");
    }
}