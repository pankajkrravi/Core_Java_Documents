import java.util.Scanner;

public class FactOfnProg3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num to find factorial");
		int n=sc.nextInt();
		int fact=factorial(n);
		System.out.println(+n+" ! ="+fact);
	}
	private static int factorial(int n) {
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
