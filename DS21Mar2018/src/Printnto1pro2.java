import java.util.Scanner;
public class Printnto1pro2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num to print in reverse order");
		int n=sc.nextInt();
		print(n);
	}
	private static void print(int n) {
		if(n>0)
		{
			System.out.println(n);
			print(n-1);
		}
	}
}
