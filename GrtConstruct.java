import java.util.Scanner;
class Great
{
Great(int a,int b,int c)
{
if (a>b)
{
if(a>c)
{
System.out.println(a+" is greater");
}
else
{
System.out.println(c+" is greater");
}
}
else
{
if(b>c)
{
System.out.println(b+" is greater");
}
else
{
System.out.println(c+" is greater");
}
}
}
}
class GrtConstruct
{
public static void main(String args[])
{
System.out.println("Enter three numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
new Great(a,b,c);
}
}