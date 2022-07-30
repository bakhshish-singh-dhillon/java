import java.io.*;

class Student implements Serializable{

	   String name;
	   String id;

	public void setname(String name){
		   this.name = name;
	   }
	   
	public void setid(String id){
		   this.id = id;
	   }
 	public void show(){
		   System.out.println(this.id);
		System.out.println(this.name);

	   }
}

class School 
{
public static void main(String args[]) throws Exception
{
Student s=new Student();
Student s2=new Student();
s.setname("blah");
s.setid("123");
ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("test.text"));
out.writeObject(s);
out.close();
ObjectInputStream in= new ObjectInputStream(new FileInputStream("test.text"));
try{
while(true)
{
s2=(Student)in.readObject();
}
}
catch(EOFException ex)
{}
s2.show();
}
}
