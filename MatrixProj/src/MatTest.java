import java.util.Scanner;
public class MatTest {
	public static void main(String[] args) {
		AddtwoMat adm=new AddtwoMat();
		System.out.println("Read first Matrix :");
		int a[][]=adm.readMat();
		System.out.println("Read Second Matrix :");
		int b[][]=adm.readMat();
		System.out.println("First matrix elements :");
		adm.displayMat(a);
		System.out.println("------------------------");
		System.out.println("Second matrix elements :");
		adm.displayMat(b);
		System.out.println("--------------------------");
		int s[][]=adm.addMat(a, b);
		if(s!=null)
		{
			System.out.println("Addition of First and Second Matrix :");
			adm.displayMat(s);
		}
	}

}
