
public class Methodsobjects 
{
int max(int x,int y)
{
	if(x>y)
		return x;
	else
		return y;
	
}
public static void main(String[] args)
{
	int a=20,b=30;
	Methodsobjects mp=new Methodsobjects();
	System.out.println(mp.max(a, b));
}
}
