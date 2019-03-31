package AbstDemo2;

public class AbDemo2 {
	public static void main(String[] args) {
	}
	public static void show(Phone obj)
	{
		Iphone obj=new Iphone();
		Samsungz4 obj1=new Samsungz4();
		showConfig(obj);
	}
}
abstract class Phone
{
	public abstract void showConfig();
}
class Iphone extends Phone
{
	public void showConfig()
	{
		System.out.println("2 GB,IOS,6.3");
	}
}
class Samsungz4
{
	public void showConfig()
	{
		System.out.println("2 GB,Tizen");
	}
}

