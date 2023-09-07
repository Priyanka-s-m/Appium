
public class vararguments 
{
	public static void show(int ...A)
	{
		for(int x:A)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args)
	{
		show();
		show(23,34,33,23);
		show(new int[]{3,45,4,3,23,55,98});

	}

}
