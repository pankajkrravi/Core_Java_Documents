import java.util.Scanner;

public class ReadaNumberAndDispSumOfFirstNNaturalNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		System.out.print("Sum of "+ n +" natural numbers =");
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		System.out.println(sum);
	}
}
