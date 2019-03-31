import java.util.Scanner;

public class Evensum {
	public static void main(String[] args)
	{	
		System.out.println("\n Enter the number till that you want to print the sum of even nos:");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int s=getSum(number);
		System.out.println("\n The sum is"+s);
	}
	static int getSum(int no)
	{  	int sum =0,i;    
		for(i=1;i<=no;i++)
		{
		
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum;

	}

}

