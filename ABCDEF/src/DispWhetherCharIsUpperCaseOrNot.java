import java.util.Scanner;
public class DispWhetherCharIsUpperCaseOrNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Character ");
		char c=s.next().charAt(0);
		if(c>='A'&&c<='Z')
			System.out.println("The given Character is  in UpperCase");
		else
			System.out.println("The given Character is not in Uppercase ");
	}
}
