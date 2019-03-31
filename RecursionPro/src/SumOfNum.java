import java.util.Scanner;
//sum od digits
public class SumOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		sum(n);
		System.out.println("sum of digits: "+sum(n));
	}

	private static int sum(int n) {
		if(n<=9){
			return n;
		}
		else{
			return n%10+sum(n/10);
		}
	}

}
