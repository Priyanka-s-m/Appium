import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=15 && age<=70)
		{
			System.out.println("younger");
		}
		else
		{
			System.out.println("elder");
		}
		

	}

}
