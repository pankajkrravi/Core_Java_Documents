import java.util.Scanner;
public class ReadANumAndDispFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find Factorial");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println(+n+ " ! ="+fact);
	}

}
