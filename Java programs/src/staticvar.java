
public class staticvar {
	static int staticvariable=10;

	public static void main(String[] args) 
	{
		staticvar obj=new staticvar();
		staticvar obj2=new staticvar();
		System.out.println("obj.staticvariable:"+obj.staticvariable);
		System.out.println("obj1.staticvariable:"+obj2.staticvariable);
		obj2.staticvariable=300;
		System.out.println("obj1.staticvariablestaticvar:"+obj2.staticvariable);
		System.out.println(+obj2.staticvariable);
	}

}
