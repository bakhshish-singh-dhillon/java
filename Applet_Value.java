import java.awt.*;
import java.applet.*;
public class Applet_Value extends Applet
{
TextField txt1,txt2;

public void init()
{
txt1=new TextField(8);
txt2=new TextField(8);
add(txt1);
add(txt2);
txt1.setText("0");
txt2.setText("0");
}

public void paint(Graphics g)
{
int x=0,y=0,z=0;
String s1,s2,s;
g.drawString("Input the numbers",50,50);
try
{
s1=txt1.getText();
x=Integer.parseInt(s1);
s2=txt2.getText();
y=Integer.parseInt(s2);
}
catch(Exception e)
{
}

z=x+y;
s=String.valueOf(z);
g.drawString("The  sum is:",10,75);
g.drawString(s,100,75);
}

public boolean action(Event event,Object obj)
{
repaint();
return true;
}

}