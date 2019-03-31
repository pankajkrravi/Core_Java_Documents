import java.util.Scanner;

public class FirstcharOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int n = ch.length;
		int count = 1;
		for (int i = 2; i <= n; i++) {
			if (ch[1] == ch[i]) {
				count++;
			}
			System.out.println(count);
		}
	}
}
