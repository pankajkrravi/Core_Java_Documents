
public class MainRunner {

	public static void main(String[] args) {
		ArrayOeration ao=new ArrayOeration();
		int x[]=ao.readArray();
		System.out.print("Before reverse: ");
		ao.dispArray(x);
		ao.reverse(x);
		System.out.print("After reverse: ");
		ao.dispArray(x);
	}

}
