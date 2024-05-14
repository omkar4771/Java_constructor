package constructor;
import java.util.*;	
class Employee1
{	int eid,bs,ws,Total;
	String enmae;
	Employee1(int eid,String ename,int bs)
	{
		this.eid=eid;
		//this.ename=ename;
		this.bs=bs;
	}
	void show()
	{	
		System.out.println("Enter withdrawn amount in your salary : ");
		Scanner sc=new Scanner (System.in);
		ws=sc.nextInt();
		Total=bs-ws;
	}
}
class Manager1 extends Employee1
{	
	int hra,ta,da,gs,Ms;
	Manager1(int eid,String ename,int bs,int hra,int ta)
	{
		super(eid,ename,bs);
		this.hra=hra;
		this.ta=ta;
	}
	void calsalary()
	{
		Ms=Total+hra+ta;
		System.out.println("Manager Sallary = "+Ms);
	}
}
public class Emp_salary
{
	public static void main(String[] args) 
	{
		int eid,bs,hra,ta;
		String ename;
		Scanner sc=new Scanner(System.in);
		System.out.print("1) Enter Employee Id : ");
		eid=sc.nextInt();
		System.out.print("2) Enter Employee Name :");
		ename=sc.next();
		System.out.print("3) Enter Employee Basic sallary :");
		bs=sc.nextInt();
		System.out.print("4) Enter Employee House rent :");
		hra=sc.nextInt();
		System.out.print("5) Enter Employee traveling allowanc :");
		ta=sc.nextInt();
		Manager1 m1=new Manager1(eid,ename,bs,hra,ta);
		m1.show();
		m1.calsalary();
	}
}
