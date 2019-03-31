import java.util.Scanner;
public class DispCharIsSpecialSymbolorNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character ");  
		char c=sc.next().charAt(0);
		if(c>=32||c<=47||c>=58||c<=64||c>=91||c<96||c>=123||c<=127)
			System.out.println("Entred character is s apecial symbol");
		else
			System.out.println("Entred characrer is not a Special symbol");
	}
}
