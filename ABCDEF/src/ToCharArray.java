import java.util.Scanner;
public class ToCharArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		char ch[]=str.toCharArray();
		for(int i=1;i<str.length();i++)
		{
			System.out.println(ch[i]);
		}
	}
}
