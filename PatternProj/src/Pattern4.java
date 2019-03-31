import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("enter no of lines");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>0;j--){
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
}
	
