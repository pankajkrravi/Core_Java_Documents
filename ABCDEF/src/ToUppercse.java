import java.util.Scanner;

public class ToUppercse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string in lowercase");
		String str = sc.next();
		System.out.println("your entered string =" + str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch > 96 && ch < 123) {
				ch=(char) (ch-32);
				System.out.println(ch);
			}
		}
	}
}
