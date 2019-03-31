import java.util.Scanner;
public class Patt4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println();
			for(int sp=1;sp<=num-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
					System.out.print(1);
				if(i!=j)
				{
					System.out.print("*");
				}
			}
		}
	}
	
}
