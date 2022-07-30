interface A
{
final static int b=10;
void Adisplay();
}

class B 
{
int a;
void Bdisplay(int a)
{
this.a=a;
System.out.println("This is class A:"+a);
}
}
class C extends B implements A
{
public void Adisplay()
{
System.out.println("This is method of Interface B");
}
}

class Interfaces extends C
{
public static void main(String []arr)
{
C obj=new C();
obj.Bdisplay(5);
obj.Adisplay();
System.out.println(obj.b);
}
}