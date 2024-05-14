package constructor;
import java.util.*;
class Employee
{
	int id,bdate;
	String name;
	Employee(int id,int bdate,String name)
	{
		this.id=id;
		this.bdate=bdate;
		this.name=name;
	}
	void display()
	{
		System.out.println("Employee id = "+id);
		System.out.println("Employee birth date = "+bdate);
		System.out.println("Employee name = "+name);
	}
}
class Manager extends Employee
{
	int jdate;
	String Dname;
	Manager(int id,int bdate,String name,String Dname,int jdate)
	{
			super(id,bdate,Dname);
			this.Dname=Dname;
			this.jdate=jdate;
	}
	void Mdisplay()
	{
		System.out.println("Employee Department name = "+Dname);
		System.out.println("Employee joining date = "+jdate);
	}
}
public class exercise_01 
{
	public static void main(String[] args) 
	{	int id,bdate,jdate;
		String name,Dname;
		System.out.println("Enter Empoyee id,birth date,Depertment name,joining date");
		Scanner sc = new Scanner(System.in);
		id=sc.nextInt();
		Manager m1= new Manager(id,bdate,name,Dname,jdate);
		m1.display();
		m1.Mdisplay();
	}
}
