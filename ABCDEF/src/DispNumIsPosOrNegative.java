import java.util.Scanner;

public class DispNumIsPosOrNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int a=sc.nextInt();
		if(a>0)
			System.out.println(+a +" is Positive number");
		else
			System.out.println(+a+ " is Negative number");
	}
}
