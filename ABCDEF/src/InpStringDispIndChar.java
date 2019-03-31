import java.util.Scanner;
//WAJP to read a String values from user and display its individual characters.
public class InpStringDispIndChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String values :");
		String str=sc.nextLine();
		char []ca=str.toCharArray();
		for (char c : ca) {
			System.out.println(c);
		}
	}
}
