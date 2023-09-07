import java.util.Scanner;

public class Maxnum {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		
		int a[]= {2,3,5,22,98,44,65};
		 int max1=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max1=a[i];
			}
			System.out.println("Max number is:"+max1);
		}
		

	}

}
