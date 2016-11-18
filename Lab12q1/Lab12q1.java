import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<object code="Lab12q1" height=500 width=500>
</object>
*/

public class Lab12q1 extends Applet
{
    Button btnleft;
    Button btnright;
    
    int n;
    public void init()
    {
        try
        {
            //SwingUtilities.invokeAndWait(new Runnable(){
              //  public void run(){makeGUI();}});
              makeGUI();
        }
        catch(Exception e)
        {
        }
    }
    public void makeGUI()
    {
        repaint();
        setLayout(new FlowLayout());
        btnright=new Button("Print Right");
        btnleft=new Button("Print Left");
        btnleft. addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                n=10;
                repaint();
            }
        });
        btnright. addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                n=490;
                repaint();
            }
        });
        add(btnleft);
        add(btnright);
       
    }
    public void paint(Graphics g)
    {
        g.drawString("Painted bc!!", n, 60);
    }
}
        
        
