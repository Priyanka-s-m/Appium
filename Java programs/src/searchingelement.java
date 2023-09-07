import java.util.Scanner;

public class searchingelement {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int key=sc.nextInt();
		
		int a[]= {2,5,7,4,8,9,5,55,34};
		
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Element found at "+i);
				System.exit(0);
			}
		}
				System.out.println("number not found");
			}
		}
		

	


