import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("enter no ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			for(int i=1;i<=n;i++){
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}

