class Prime
{
public static void main(String args[])
{
int per;
for(int i=1;i<100000;i++)
{
per=0;
for(int j=1;j<i;j++)
{
if(i%j==0)
per=per+j;
}
if(per==i)
System.out.println(i);
}
}
}