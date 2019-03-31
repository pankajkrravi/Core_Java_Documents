import java.util.Scanner;

public class SumOfIndividualDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sum=0;
		int t=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(t +" sum off individual digits ="+sum);
	}
}
