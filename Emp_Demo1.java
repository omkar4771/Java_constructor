package constructor;
import java.util.*;
class employee
{
	int id,dob;
	String name;
	employee(int id,int dob,String name)
	{
		this.id=id;
		this.dob=dob;
		this.name=name;
	}
	void display()
	{
		System.out.println("enter the id"+id);
		System.out.println("enter the deth of birth "+dob);
		System.out.println("enter the name"+name);
	}
}
class manager extends employee
{	
	int jd;
	String dn;
	manager(int id,int dob,String name,int jd,String dn)
	{
		super(id,dob,name);
		this.jd=jd;
		this.dn=dn;
	}
	void show()
	{
		System.out.println("joinning date="+jd);
		System.out.println("demartment name"+dn);
	}
}
public class Emp_Demo1 
{

	public static void main(String[] args) 
	{
		int id,dob,jd;
		String dn,name;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the imformationn of employee   id   name  dob");
		id=sc.nextInt();
		name=sc.next();
		dob=sc.nextInt();
		System.out.println("enter the imformation of manager  jd  and dn");
		jd=sc.nextInt();
		dn=sc.next();
		
		manager m1 = new manager(id,dob,name,jd,dn);
		m1.display();
		m1.show();

	}

}
