import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(0+"");
				else
					System.out.print(1+"");
			}
			System.out.println();
		}
		
	}
}
