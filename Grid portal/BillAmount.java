import java.util.*;

class BillAmount
{
	static double calcu(int curr_red)
	{
		double amt=0;
		int unit=curr_red;
		if(unit>501)
			amt=unit*7.00;
		else if(unit<=500 && unit>200)
			amt=unit*4.50;
		else if(unit<=200 && unit>100)
			amt=unit*3.00;
		else
			amt=unit*1.50;
		return amt;
	}
	public static void main(String arg[])
	{
		
		int num,pre_red,curr_red,type;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the consumer Name");
		name=sc.next();
		System.out.println("Enter the consumer Number");
		num=sc.nextInt();
		System.out.println("Enter the previous month reading");
		pre_red=sc.nextInt();
		System.out.println("Enter the current month reading");
		curr_red=sc.nextInt();
		System.out.println("Enter the 0 for Domestic connection");
		type=sc.nextInt();
		if(type==0)
			System.out.println("Bill Amount is : "+calcu(curr_red));
	}
}
		