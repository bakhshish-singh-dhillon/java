class Pattern3
{
public static void main(String args[])
{
for(int i=0;i<20;i++)
{
for(int j=20;j>i;j--)
{
System.out.print(" ");
}
for(int k=0;k<=(2*i);k++)
{
System.out.print("*");
}
System.out.println("");
}
}
}