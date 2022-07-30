import java.awt.*;
import java.applet.Applet;
public class Triangle extends Applet
{
public void paint(Graphics g)
{
int x[]={30,30,60,90,120,120,90,60,30};
int y[]={30,60,90,90,60,30,1,1,30};
int r=x.length;
g.drawPolygon(x,y,r);
}
}