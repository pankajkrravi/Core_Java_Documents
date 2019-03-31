import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		System.out.println("enter no of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(j+"");
			}
			System.out.println();
		}
	}

}
