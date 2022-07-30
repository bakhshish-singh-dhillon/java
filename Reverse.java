class Reverse
{
public static void main(String args[])
{
int num =Integer.parseInt(args[0]);
int temp=num;
int ans[ ]=new int [10];
int i=0,j;
while(!(temp==0))
{
ans[i]=temp%10;
temp=temp/10;
i++;
}
System.out.print("the reverse of "+ num +" is ");
for(j=0;j<i;j++)
{
System.out.print(ans[j]);
}
}
}