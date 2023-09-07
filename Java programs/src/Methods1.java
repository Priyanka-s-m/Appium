
public class Methods1 
{

	static boolean isPrime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)	
				return false;
		}
		
		
		return true;

	}

	public static void main(String[] args) 
	{
		if(isPrime(22))
			
		System.out.println("Prime number");
		else
			System.out.println("not a prime number");
	}

}
