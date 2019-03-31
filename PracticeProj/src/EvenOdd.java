import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = in.nextInt();
		evenOdd(number);
	}
	public static String evenOdd(int n) {
		String s = "";

		if (n % 2 == 0) {
			s = n + " is an even number";
		} else {
			s = n + " is an odd number";
		}
		return s;
	}
}
