import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		System.out.println("enter no of lines");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}