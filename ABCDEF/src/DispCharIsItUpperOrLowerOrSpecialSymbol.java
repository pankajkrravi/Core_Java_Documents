import java.util.Scanner;

public class DispCharIsItUpperOrLowerOrSpecialSymbol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character ");
		char c=sc.next().charAt(0);
		if ((c>= 65 && c<= 122))
			System.out.println("Entered character is Alphabet");
		// CHECKING FOR DIGITS 
		else if ( c>= 48 &&  c<= 57)
			System.out.println("Entred character   a   digite");
		// OTHERWISE SPECIAL CHARACTER
		else  
			System.out.println("Entred character id special symbol");
	}
}
