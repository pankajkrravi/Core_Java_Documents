import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Rnter your name");
		String name=sc.next();
		System.out.println("enter your emailid");
		String emailid=sc.next();
		System.out.println("Enter your mobno");
		long mobno=sc.nextLong();
		System.out.println("Enter your Quqlification");
		String qualification=sc.next();
		System.out.println("   Hii   " +name+" your addressis   "+emailid+"  "+mobno+"    "+qualification+"  ");
	}

}
