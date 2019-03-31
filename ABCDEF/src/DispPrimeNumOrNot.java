import java.util.Scanner;

public class DispPrimeNumOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number to check whether it i sprime or not");
		int n=sc.nextInt();
		int count=0;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(+n+" is a Prime Number");
		else
			System.out.println(+n+" is Not a Prime Number");
	}
}
