class A
{
int x=15;
A(int x)
{
System.out.println(this.x);
System.out.println(x);
}
}
class Super
{
public static void main(String args[])
{
A obj=new A(5);
}
}