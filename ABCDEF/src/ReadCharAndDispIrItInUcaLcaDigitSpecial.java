import java.util.Scanner;

public class ReadCharAndDispIrItInUcaLcaDigitSpecial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character :");
		char c=sc.next().charAt(0);
		if(c>='A'&&c<='Z')
			System.out.println(+c+ " character in Upper Caes Alphabet");
		else if (c>='a'&&c<='z')
			System.out.println(+c+ "  Character is a Lower Case Alphabet");
		else if (c>='0'&&c<='9')
			System.out.println(+c  +" Character is a Digit");
		else
			System.out.println(+c+ "  Character is a Special Symbol");
	}
}
