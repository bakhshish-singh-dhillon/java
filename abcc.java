import java.util.*;
class abcc		
{
public static void main(String arr[])
{
Vector v=new Vector();
for(int i=0;i<arr.length;i++)
{
v.addElement(arr[i]);
}
v.insertElementAt("pure",2);
int size=v.size();
String arr1[]=new String[size];
v.copyInto(arr1);
for(int i=0;i<size;i++)
{
System.out.println(arr1[i]);
}
}
}