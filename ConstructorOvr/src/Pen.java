
public class Pen {
	String color;
	String type;
	double price;
	//zero param constructor
	Pen()
	{
		this(25.00);
		System.out.println("inside zero param constructor");
	}
	//2 param constructor
	Pen(String clr,String typ)
	{
		color=clr;
		type=typ;
		System.out.println("inside two param constructor");
	}
	//1 param constructor
	Pen(double pr)
	{
		price=pr;
		System.out.println("inside one param constructor "+pr);
	}
}
