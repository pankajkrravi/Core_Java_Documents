import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector(10,5);
		System.out.println(v.capacity());//10
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());//10
		v.addElement("P");
		System.out.println(v.capacity());//20
		System.out.println(v);
	}

}
