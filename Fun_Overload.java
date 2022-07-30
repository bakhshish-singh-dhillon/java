import java.util.Scanner;
class Operation
{
int sum(int a, int b)
{
return (a+b);
}
int diff(int a, int b)
{
return (a-b);
}
int sum(int a, int b, int c)
{
return (a+b+c);
}
}

class Fun_Overload
{
public static void main(String args[])
{
System.out.println("Enter first number");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
System.out.println("Enter second number");
int b=obj.nextInt();
System.out.println("Enter Third number");
int c=obj.nextInt();
Operation op=new Operation();
int result=op.sum(a,b);
System.out.println("The sum is "+result);
result=op.diff(a,b);
System.out.println("The difference is "+result);
result=op.sum(a,b,c);
System.out.println("The sum is "+result);
}
}
