import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		int   n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<i;j++){
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println();
		}
	}

}
