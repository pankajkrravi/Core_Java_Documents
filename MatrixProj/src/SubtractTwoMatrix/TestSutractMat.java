package SubtractTwoMatrix;

public class TestSutractMat {

	public static void main(String[] args) {
		SubtractMat stm=new SubtractMat();
		System.out.println("Read first Matrix :");
		int a[][]=stm.readMat();
		System.out.println("Read Second Matrix :");
		int b[][]=stm.readMat();
		System.out.println("First matrix elements :");
		stm.displayMat(a);
		System.out.println("------------------------");
		System.out.println("Second matrix elements :");
		stm.displayMat(b);
		System.out.println("--------------------------");
		int s[][]=stm.sbMat(a, b);
		if(s!=null)
		{
			System.out.println("Sustraction of First and Second Matrix :");
			stm.displayMat(s);
		}
	}
}
