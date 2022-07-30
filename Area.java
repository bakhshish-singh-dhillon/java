import custom.Rectangle;
import java.util.Scanner;
class Area
{
public static void main(String args[])
{
int x,y,z;
Scanner in=new Scanner(System.in);
System.out.println("Enter Lenth");
x=in.nextInt();
System.out.println("Enter Breadth");
y=in.nextInt();
Rectangle obj=new Rectangle();
z=obj.area(x,y);
System.out.println("The area is:"+z);
}
}