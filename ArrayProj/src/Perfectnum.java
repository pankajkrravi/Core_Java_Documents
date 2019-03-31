import java.util.Scanner;

public class Perfectnum {
	public static void main(String[] args) {
		System.out.println("\n Enter any no.");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int pr=prfectnum(num);
		if(pr==num)
			System.out.println(" perfect no "+num);
		else
			System.out.println("Not a perfect num "+num);
	}
	static int prfectnum(int n)
	{  
		int arr[]=new int[20];
		int sum=0,a=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				arr[a]=i;
				a++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
}


