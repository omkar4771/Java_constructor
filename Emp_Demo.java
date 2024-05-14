package constructor;
import java.util.*;

class Employee
{
	int eid;
	String name;
	double salary;
	Employee()
	{
		eid=101;
		name="sam";
		salary=9876.90;
	}
	Employee(int eid, String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{	/*System.out.println("Emp id="+eid);
		System.out.println("Name="+name);
		System.out.println("Salary="+salary);*/
		System.out.println(eid+"\t"+name+"\t"+salary);
	}
}
public class Emp_Demo 
{
	public static void main(String[] args) 
	{
		int eid,i;
		String name;
		double salary;
		
		Employee e=new Employee();
		//e.display();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of  records");
		int n=sc.nextInt();
		
		Employee e1[]=new Employee[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter id, name & salary");
			eid=sc.nextInt();
			name=sc.next();
			salary=sc.nextDouble();
			
			e1[i]= new Employee(eid,name,salary);
		}
		System.out.println("Eid\tEnmae\tSalary");
		System.out.println("-----------------------------\n");
		//e1[1].display();
		for(i=0;i<n;i++)
		{
			e1[i].display();
		}
		
	}

}
