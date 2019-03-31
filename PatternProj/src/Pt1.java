import java.util.Scanner;

public class Pt1 {

	public static void main(String[] args) {
		//System.out.println("enter no of lines");
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		for(int i=1;1<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print(" * ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}



