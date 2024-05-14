package constructor;
import java.util.*;

class Book_Demo
{
	int bid;
	String bname,author;
	double price;
	Book_Demo()
	{
		bid=101;
		bname="sam";
		author="omkar";
		price=9876.90;
	}
	Book_Demo(int bid, String bname,String author,double price)
	{
		this.bid=bid;
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
	void display()
	{	/*System.out.println("Emp id="+eid);
		System.out.println("Name="+name);
		System.out.println("Salary="+salary);*/
		System.out.println(bid+"\t"+bname+"\t"+author+"\t"+price);
	}
}
public class Book 
{
	public static void main(String[] args) 
	{
		int bid,i;
		String bname,author;
		double price;
		
		Book_Demo b=new Book_Demo();
		b.display();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of  records");
		int n=sc.nextInt();
		
		Book_Demo b1[]=new Book_Demo[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter id, name & salary");
			bid=sc.nextInt();
			bname=sc.next();
			author=sc.next();
			price=sc.nextDouble();
			
			b1[i]=new Book_Demo(bid,bname,author,price);
		}
		System.out.println("Eid\tEnmae\tSalary");
		System.out.println("-----------------------------\n");
		//e1[1].display();
		for(i=0;i<n;i++)
		{
			b1[i].display();
		}
		
	}

}
