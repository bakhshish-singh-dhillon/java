import java.util.Scanner;
import java.io.*;

class Details implements Serializable
{
public String name, id, add, phn, age, gender;
}

class Student extends Details implements Serializable
{
public String clas, section, marks, discipline, attend;
public void setname(String name)
{
this.name=name;
}
public void setid(String id)
{
this.id=id;
}
public void setadd(String add)
{
this.add=add;
}
public void setphn(String phn)
{
this.phn=phn;
}
public void setage(String age)
{
this.age=age;
}
public void setgender(String gender)
{
this.gender=gender;
}
public void setclass(String clas)
{
this.clas=clas;
}
public void setsection(String section)
{
this.section=section;
}
public void setmarks(String marks)
{
this.marks=marks;
}
public void setdiscipline(String discipline)
{
this.discipline=discipline;
}
public void setattend(String attend)
{
this.attend=attend;
}
public void show()
{
}
}


class Teacher extends Details implements Serializable
{
public String subject;
public void setname(String name)
{
this.name=name;
}
public void setid(String id)
{
this.id=id;
}
public void setadd(String add)
{
this.add=add;
}
public void setphn(String phn)
{
this.phn=phn;
}
public void setage(String age)
{
this.age=age;
}
public void setgender(String gender)
{
this.gender=gender;
}
public void setsubject(String subject)
{
this.subject=subject;
}
public void show()
{
System.out.print(name+" "+id+" "+age+" "+add+" "+gender+" "+subject+" "+phn);
}
}

class SHS
{
public static void main(String args[]) throws Exception
{
Student s=new Student();
Teacher t=new Teacher();
char ch='y';
Scanner sc=new Scanner(System.in);
while(ch=='y' || ch=='Y')
{
System.out.println("Enter the Choice(1-3)");
System.out.println("1.Add\n2.Edit\n3.Delete\n4.View");
int c=sc.nextInt();
switch (c)
{
case 1:
{
System.out.println("Do you want to Add");
System.out.println("1.Student details \n2.Teacher's Detail");
int c1=sc.nextInt();
switch (c1)
{
case 1:
{
System.out.println("Enter Student Detail:");
System.out.print("Name:");
s.setname(sc.nextLine());
System.out.print("id:");
s.setid(sc.nextLine());
System.out.print("Address:");
s.setadd(sc.nextLine());
System.out.print("phone:");
s.setphn(sc.nextLine());
System.out.print("age:");
s.setage(sc.nextLine());
System.out.print("gender:");
s.setgender(sc.nextLine());
System.out.print("class:");
s.setclass(sc.nextLine());
System.out.print("section:");
s.setsection(sc.nextLine());
System.out.print("marks:");
s.setmarks(sc.nextLine());
System.out.print("disciplne:");
s.setdiscipline(sc.nextLine());
System.out.print("attendance:");
s.setattend(sc.nextLine());
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Student.text"));
out.writeObject(s);
System.out.println("DONE!!");
out.close();
break;
}
case 2:
{
System.out.println("Enter Teacher Detail:");
System.out.print("Name:");
t.setname(sc.nextLine());
System.out.print("id:");
t.setid(sc.nextLine());
System.out.print("Address:");
t.setadd(sc.nextLine());
System.out.print("phone:");
t.setphn(sc.nextLine());
System.out.print("age:");
t.setage(sc.nextLine());
System.out.print("gender:");
t.setgender(sc.nextLine());
System.out.print("subject:");
t.setsubject(sc.nextLine());
ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Teacher.text"));
out.writeObject(t);
System.out.println("DONE!!");
out.close();
break;
}
}
break;
}

case 2:
{
break;
}
case 3:
{
break;
}

case 4:
{
System.out.println("Do you want to Add");
System.out.println("1.Student details \n2.Teacher's Detail ");
int c1=sc.nextInt();
switch (c1)
{
case 1:
{
System.out.println("Student's detail is:");
ObjectInputStream in= new ObjectInputStream(new FileInputStream("Student.text"));
try{
while(true)
{
s=(Student)in.readObject();
s.show();
System.out.println("");
}
}
catch(EOFException ex)
{}
in.close();
break;
}
case 2:
{
System.out.println("Teacher's detail is:");
ObjectInputStream in= new ObjectInputStream(new FileInputStream("Teacher.text"));
try{
while(true)
{
t=(Teacher)in.readObject();
t.show();
System.out.println("");
}
}
catch(EOFException ex)
{}
in.close();
break;
}
}
break;
}

}

System.out.print("Want to perform another operation?(Y/N):");
ch=sc.next().charAt(0);
}
}
}