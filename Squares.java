import java.awt.*;
import java.applet.*;
public class Squares extends Applet
{
public static void main(String args[])
{
System.out.println(Color.red);
}
public void paint(Graphics g)
{
Random n=new Random();
String str[]={"Color.red","Color.green"};
for(int i=0;i<10;i++)
{
try
{
g.setColor(str[0]);
g.fillRect(20,20,20,20);
Thread.sleep(1000);
g.setColor(str[1]);
g.fillRect(20,20,20,20);
Thread.sleep(1000);
}
catch(Exception e){}
}
}
}