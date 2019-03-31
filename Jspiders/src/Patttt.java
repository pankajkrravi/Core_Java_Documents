import java.util.Scanner;

public class Patttt {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				int k=1;
				System.out.println();
				for(int sp=1;sp<=num-i;sp++)
				{
					System.out.print("_");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(k);
					if(j!=i)
					{
						System.out.print("*");
					}
					if(j==i)
					{
						System.out.print("_");
					}
				}
			}
		}
		
	}

