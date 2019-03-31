import java.util.Scanner;

public class DispCharIsLowercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=sc.next().charAt(0);
		if(c>='a'&&c<='z')
			System.out.println("Entred character is Lowercase Alphabet");
		else
			System.out.println("Entred Character is not Lowercase Alphabet");
	}

}
