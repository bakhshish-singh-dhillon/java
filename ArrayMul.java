import java.util.Scanner;
class ArrayMul
{
public static void main(String [] args)
{
System.out.println("Enter the number of rows and columns of first matrix");
Scanner sc=new Scanner(System.in);
int m,n,M,N;
m=sc.nextInt();
n=sc.nextInt();
System.out.println("Enter the number of rows and columns of second matrix");
M=sc.nextInt();
N=sc.nextInt();
int arr[][]=new int[m][n];
int arr1[][]=new int[M][N];
int mul[][]=new int[m][N];
if(n==M)
System.out.println("Enter the values of first matrix");
{
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("Enter the values of second matrix");
for(int i=0;i<M;i++)
{
for(int j=0;j<N;j++)
{
arr1[i][j]=sc.nextInt();
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<N;j++)
{
mul[i][j]=0;
for(int k=0;k<n;k++)
{
mul[i][j]=mul[i][j]+(arr[i][k]*arr1[k][j]);
}
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<N;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println();
}
}
else
{
System.out.print("Matrix cannot b multiplied");
}
}
}