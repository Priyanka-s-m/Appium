
public class arraysum {

	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,2,4,6,7,9};
		int sum=0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum=sum+a[i];
//		
//		}
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println("sum is " +sum);

	}

}
