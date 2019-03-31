
public class B {
	B()
	{
		super();//1sr executable line
		System.out.println("B constructor");
	}
	public static void main(String[] args) {
		System.out.println("App start");
		new B();
		System.out.println("App end");
	}
}
