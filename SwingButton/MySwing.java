import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/*<object code="MySwing" height=200 width=300>
</object>*/
public class MySwing extends JApplet
{
    JFrame jfrm;
    JLabel jlab;
    JButton btn1;
    JButton btn2;
    public void init()
    {
        try
        {
            SwingUtilities.invokeAndWait(new Runnable(){
                public void run(){makeGUI();}});
            }
        catch(Exception e)
        {
        }
    }
    public void start()
    {
    }
    public void makeGUI()
    {
        setLayout(new FlowLayout());
        jfrm=new JFrame("All is Well");
        jlab=new JLabel("Press a Button");
        btn1=new JButton("Button 1");
        btn2=new JButton("Button 2");
        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                jlab.setText("Button1 was clicked");
            }
        });
        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                jlab.setText("Button2 was clicked");
            }
        });
        add(btn1);
        add(btn2);
        add(jlab);
    }
}
      