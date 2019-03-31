import java.util.Scanner;

public class PatternHw1 {

	public static void main(String[] args) {
		System.out.println("enter no of lines");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i < n; i++) 
		{
			for (int j =1; j < i; j++)
				System.out.print(" ");
			for(int k=i;k<=n;k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

