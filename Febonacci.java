class Febonacci
{
public static void main(String args[])
{ 
int a=1;
int b=0;
int c=0;
for(int i=0;i<=25;i++)
{
System.out.println(c);
c=a+b;
a=b;
b=c;
}
}
}