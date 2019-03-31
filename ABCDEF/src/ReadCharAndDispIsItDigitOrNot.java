import java.util.Scanner;

public class ReadCharAndDispIsItDigitOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		char c=sc.next().charAt(0);
		if(c==0||c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8||c==9||c==10)
			System.out.println("The Entred Char is digit="+c);
		else
			System.out.println("The Entred char is not a Digit");
	}

}
