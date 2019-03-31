import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int s=getSum(n);
		System.out.println("First "+n+"  natural number is :"+s);
	}
	static int getSum(int no)
	{
		int sum=0;
		while(no>0)
		{
			sum=sum+no;
			no--;
		}
		return sum;
	}

}
