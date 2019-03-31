import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbr to reverse");
		int n=sc.nextInt();
		int re=reverse(n);
		System.out.println("reverse of the number is "+re);
	}
	static int reverse(int t) {
		int rev=0;
		do{
			int x=t%10;
			rev=rev*10+x;
			t=t/10;
		}while(t!=0);
		return rev;
	}
}
