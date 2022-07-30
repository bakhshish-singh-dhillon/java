import java.util.Scanner;
class StrComp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String str1=sc.nextLine();
if(str.compareTo(str1)==0)
{
System.out.println("Strings are equal ");
}
else
{
System.out.println("Strings are not equal ");
}
}
}