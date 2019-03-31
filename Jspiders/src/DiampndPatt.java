import java.util.Scanner;

public class DiampndPatt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int sp=1;sp<=num-i;sp++)
				System.out.print(" ");
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		num=num-1;
		for(int k=num;k>=1;k--)
		{
			
			for(int sp=0;sp<=num-k;sp++)
			{
				System.out.print(" ");
			}
			
			for(int l=(2*k)-1;l>=1;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
