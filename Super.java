class A
{
A(int x)
{
System.out.println(x);
}
}

class B extends A
{
B()
{
super(10);
}
}

class Super
{
public static void main(String args[])
{
B obj=new B();
}
}