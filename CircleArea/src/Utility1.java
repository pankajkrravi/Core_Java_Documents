
public class Utility1 {

	final double PIE=3.142;
	double findAreaOfCircle(double radius){
		double area=PIE*radius*radius;
		return area;

	}
	public static void main(String args[]){
		Utility1 u=new Utility1();
		u.findAreaOfCircle(20.9);
		double r=6.30;
		double a=u.findAreaOfCircle(r);
		System.out.println("Area of Circle="+a);
	}
}





