import java.util.Scanner;

public class Stringoccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
		int n = str.length();
		int count=1;
		char[] ch = str.toCharArray();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < i; j++) {
				if (ch[i] == ch[j]) {
					ch[j]=ch[n-1];
					n--;
					count++;
					j++;
				}
			}
			System.out.println(ch[i]+" occured ="+count);
		}
	}

}
