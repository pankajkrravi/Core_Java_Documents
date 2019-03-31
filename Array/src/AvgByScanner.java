import java.util.Scanner;

public class AvgByScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many number u want"); 
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter your " +n+" values");
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+ar[i];

		}
		System.out.println("sum of "+n+"number is:"+sum);
		System.out.println("avaerage of"+n+"number is:"+sum/(double)n);

	}
}
