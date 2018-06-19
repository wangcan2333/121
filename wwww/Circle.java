package wwww;

public class Circle implements Shape{
	final static double PI = 3.1415926;

	@Override
	public double area(double d) {
		return PI*d*d ;
	}
}
