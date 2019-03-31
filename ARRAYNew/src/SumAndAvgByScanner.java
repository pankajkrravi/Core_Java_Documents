import java.util.Scanner;

public class SumAndAvgByScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many values you want to enter in Array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("Sum ="+sum);
		System.out.println("Average="+sum/(double)n);
	}
}
