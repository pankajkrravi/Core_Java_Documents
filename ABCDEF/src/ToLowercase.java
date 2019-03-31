import java.util.Scanner;

public class ToLowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entyer String ");
		String str = sc.next();
		System.out.println("Your entred strinrg  =" + str);
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (ch > 64 && ch < 91) {
				ch = ch + 32;
				System.out.println("CONVERTD into lower CASE  STRING =" + (char) ch);
			}

		}
	}
}
