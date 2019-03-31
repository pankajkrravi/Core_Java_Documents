import java.util.Scanner;

public class ReadCharDispItsUpperCaseChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character in lower case ");
		char c=sc.next().charAt(0);
		System.out.println(" Entred character :"+c);
		int temp=(int)c;
		temp=temp-32;
		char ch=(char)temp;
		System.out.println(" Equivlent char in Upper Case is "+ch);
	}

}
