import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		System.out.println("enter no of lines ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=i;j<=n;j++){

				System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
