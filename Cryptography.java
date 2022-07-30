import java.util.Scanner;
class Encrypt
{
String encrypt(String str)
{
String result="";
char ch;
for(int i=0;i<(str.length());i++)
{
if(i%2==0)
{
ch=str.charAt(i);
result=result+(char)(ch+2);
}
else
{
ch=str.charAt(i);
result=result+(char)(ch-2);
}
}
return result;
}
}

class Decrypt
{
String decrypt(String str)
{
char ch;
String result="";
for(int i=0;i<(str.length());i++)
{
if(i%2==0)
{
ch=str.charAt(i);
result=result+(char)(ch-2);
}
else
{
ch=str.charAt(i);
result=result+(char)(ch+2);
}
}
return result;
}
}

class Cryptography
{
public static void main(String args[])
{
System.out.println("Enter the phrase to encryption");
Scanner obj=new Scanner(System.in);
String str=obj.nextLine();
Encrypt enc=new Encrypt();
str=enc.encrypt(str);
System.out.println("The encrypted code is "+str);
Decrypt dec=new Decrypt();
str=dec.decrypt(str);
System.out.println("The decrypted code is "+str);
}
}
