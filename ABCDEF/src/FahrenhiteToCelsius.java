import java.util.Scanner;

public class FahrenhiteToCelsius {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter temperature in Fahrenhite:");
		int f=s.nextInt();
		int c=(f-32)*5/9;
		System.out.println("Yout fahrenhite temp in celsius ="+c);
	}
}
