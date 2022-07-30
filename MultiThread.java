class A extends Thread
{
public void run()
{
try
{
for (int i=0;i<10;i++)
{
System.out.println("A class's Thread"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e1)
{
}
}
}

class B implements Runnable
{
public void run()
{
try
{
for (int i=0;i<10;i++)
{
System.out.println("B class's Thread"+i);
Thread.sleep(2000);
}
}
catch(InterruptedException e)
{
}
}
}
class MultiThread
{
public static void main(String [] arr)
{
new A().start();
B obj=new B();
Thread th=new Thread(obj);
th.start();
for (int i=0;i<10;i++)
{
System.out.println("Main class's loop"+i);
}
}
}