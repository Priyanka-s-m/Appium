
public class staticblocks 
{
	static
	{
		System.out.println("block 1 executed");
	}
	static
	{
		System.out.println("block 2 excecuted");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		staticblocks sb=new staticblocks();
	}

}
