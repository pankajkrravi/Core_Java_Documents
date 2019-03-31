import java.util.Scanner;

public class NoofOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nymber ");
		int num = sc.nextInt();
		while (num > 0) {
			int ocount = 1;
			int ecount = 1;
			int r = num % 10;
			if (r % 2 == 0) {
				ocount++;
				System.out.println("no of odd dogits =" + ocount);
			} else if (r % 2 != 0) {
				ocount++;
				System.out.println("no of even digits =" + ecount);
			}
			num = num / 10;
		}
	}
}