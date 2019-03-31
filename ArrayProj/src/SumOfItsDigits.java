import java.util.Scanner;

public class SumOfItsDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter the num to cal bits");
		int no=sc.nextInt();
		int sum=getSumOfDigits(no);
		System.out.println(sum);
	}

	private static int getSumOfDigits(int no) {
		int sum=0;
		do{
			sum=sum+no%10;
			no=no/10;
		}
		while(no!=0);
			return sum;			

	}
}


