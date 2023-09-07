
public class gcd {

	int gcdp(int m,int n)
	{
		while(m!=n)
		{
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
		return n;

	}

	public static void main(String[] args) 
	{
		gcd gc=new gcd();

		System.out.println(gc.gcdp(76,95));
	}

}
