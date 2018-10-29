import java.util.*;

class Min
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int min=arr[0];
		for(int i=0;i<n;i++)
			if(arr[i]<min)
				min=arr[i];
		System.out.println("The minimum value in the elements is : "+min);
	}
}
