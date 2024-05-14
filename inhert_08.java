package constructor;
import java.util.*;
class employee1222
{
   int id,dob;
   String name;
   employee1222(int id,int dob,String name)
   {
	   this.id=id;
	   this.dob=dob;
	   this.name=name;
   }
   void display()
   {
	  // Scanner shubham=new Scanner(System.in);
	   System.out.println("enter the id"+id);
	   System.out.println("enter the deth of birth "+dob);
	   System.out.println("enter the name"+name);
   }
   class manager extends employee1222
   {
	   int jd;
	   String dn;
	   manager(int id,int dob,String name,int jd,String dn)
	   {
	   super(id,dob,name);
	   this.jd=jd;
	   this.dn=dn;
	   }
   void show ()
   {
	   System.out.println("joinning date="+jd);
	   System.out.println("demartment name"+dn);
   }
   
}
}
public class inhert_08
{

	public static void main(String[] args) 
	{
		int id,dob,jd;
		//int dob;
		String dn,name;
		//String name;
		//int jd;
		Scanner shubham=new Scanner (System.in);
		System.out.println("enter the imformationn of employee   id   name  dob");
		id=shubham.nextInt();
		name=shubham.next();
		dob=shubham.nextInt();
		System.out.println("enter the imformation of manager  jd  and dn");
		jd=shubham.nextInt();
		dn=shubham.next();
		manager m1=new manager(id,dob,name,jd,dn);
		m1.display();
		m1.show();
	
				
	}
}