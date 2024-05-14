package constructor;
import java.util.*;
class student
{
	int id;
	String name;
	student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void Stud_display()
	{
		System.out.println("Student Id ="+id);
		System.out.println("Student Name ="+name);
	}
}
class x_student extends student
{	
	String cname;
	double salary;
	x_student(int id,String name,String cname,double salary)
	{	
		super(id,name);
		//super(name);
		this.cname=cname;
		this.salary=salary;
	}
	void xstud_display()
	{
		System.out.println("Companey Name ="+cname);
		System.out.println("Salary ="+salary);
	}
}
public class Student_Data 
{

	public static void main(String[] args) 
	{
	  int id;
	  double salary;
	  String name,cname;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("---------- Enter the student details ----------");
	  System.out.println("1) Enter student Id - ");
	  id=sc.nextInt();
	  System.out.println("2) Enter student Name - ");
	  name=sc.next();
	  System.out.println("3) Enter student Companey name - ");
	  cname=sc.next();
	  System.out.println("4) Enter student Salary - ");
	  salary=sc.nextDouble();
	  
	  x_student s1=new x_student(id,name,cname,salary);
	  s1.Stud_display();
	  s1.xstud_display();
	  
	}

}
