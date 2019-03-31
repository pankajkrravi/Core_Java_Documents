import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factorial:");
		int n=sc.nextInt();
		fact(n);
	}

	private static int fact(int n) {
		int i,j;
		i=1;
		for(j=2;j<=n;j++){
			i=i*j;
		}
		return i;
	}
    
}
