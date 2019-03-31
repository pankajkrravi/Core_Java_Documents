public class TestAbstract {
	public static void main(String[] args) {
		Sam obj=new Anupam() {

			@Override
			public void dance() {
				// TODO Auto-generated method stub
			}
		};
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
	}
}
abstract class Sam//abstract class
{
	public void call(){
		System.out.println("Calling...");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
abstract class Karthik extends Sam//abstract class
{
	public void move()
	{
		System.out.println("Miving...");
	}
}
abstract class Anupam extends Karthik{//concrete class
	public void cance()
	{
		System.out.println("dancing....");
	}
	public void cook(){
		System.out.println("Cooking...");
	}
}
