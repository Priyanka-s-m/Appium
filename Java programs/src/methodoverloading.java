
public class methodoverloading 
{
static double area(double radius)
{
	return Math.PI*radius*radius;
}
static double area(double length, double breadth)
{
	return length*breadth;
}
public static void main(String[] args)
{
	double l=20, b=34;
	System.out.println(area(l));
}
}
