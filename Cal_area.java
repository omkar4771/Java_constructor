package constructor;
import java.util.*;
class circle
{
	double r,A;
	circle(double r)
	{
		this.r=r;
	}
	void cal_circle()
	{
		A=3.14*r*r;
		System.out.println("Area ="+A);
	}
}
class volume extends circle
{
	double h,v;
	volume(double r,double h)
	{
		super(r);
		this.h=h;
	}
	void cal_volume()
	{
		v=A*h;
		System.out.println("volume ="+v);
	}
}
public class Cal_area 
{
	public static void main(String[] args) 
	{
		double r,h;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius & height :");
		r=sc.nextInt();
		h=sc.nextInt();
		
		volume v1= new volume(r,h);
		v1.cal_circle();
		v1.cal_volume();

	}

}
