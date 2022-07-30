import java.awt.*;
import java.applet.*;
public class Hut extends Applet 
{

public void init()
{
ActionEvent e;
Button b=new Button("Night");
b.setActionCommand("Night");
b.addActionListener(new ButtonClickListener());
add(b);
}

public void paint(Graphics g)
{
int x[]={60,150,250,250,60,60,600,600,60,60,150,500,600,60};
int y[]={250,60,250,600,600,250,250,600,600,250,60,60,250,250};
g.drawPolygon(x,y,x.length);
g.drawRect(390,390,40,40);
g.drawRect(430,390,40,40);
g.drawRect(390,430,40,40);
g.drawRect(430,430,40,40);
g.drawRect(115,450,80,150);
for(int i=150, j=250;i<500;i+=60)
{
g.drawLine(i,60,j,250);
j+=60;
}
for(int i=150, j=60;i<250;i+=20)
{
g.drawLine(i,j,(i+350),j);
j+=38;
}
g.drawArc(700,450,40,150,90,180);
g.drawArc(650,450,40,150,270,180);
g.drawOval(670,270,50,200);

int i=800,j=50;
String cmd=e.getActionCommand();
while(!(cmd.equals("Night")))
{
int tempi=i;
int tempj=j;
g.setColor(Color.black);
g.drawArc(i,j,10,10,0,90);
g.drawArc(i+10,j,10,10,90,90);
try{
Thread.sleep(150);
g.setColor(Color.white);
g.drawArc(i,j,10,10,0,90);
g.drawArc(i+10,j,10,10,90,90);
}
catch(Exception e){}
g.setColor(Color.black);
g.drawArc(i,j+5,10,10,90,90);
g.drawArc(i,j+5,10,10,0,90);
try{
Thread.sleep(150);
g.setColor(Color.white);
g.drawArc(i,j+5,10,10,90,90);
g.drawArc(i,j+5,10,10,0,90);
}
catch(Exception e){}

cmd=e.getActionCommand();
i--;
if(cmd.equals("Night"))
{
b.setText("Day");
b.setActionCommand("Day");
}
}
}
}