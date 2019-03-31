package Assignment2;

public class PerfectTest {

	public static void main(String[] args) {
		PerfectNumber pn=new PerfectNumber();
		int p[]=pn.readArray();
		System.out.println("Before checking perfect num");
	pn.dispPerfectNum(p);
	System.out.println("Perfect number :");
	pn.dispPerfectNum(p);
	
	}

}
