import java.util.Scanner;

public class PatternHw3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many rows you want in this pattern?");

		int n = sc.nextInt();
		for (int i = 1; i<= n; i++) 
		{
			for(int k=(n-1);k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

