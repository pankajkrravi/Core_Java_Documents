import java.util.Scanner;

public class FactEach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number whose factorial is to be found: ");
		int n = sc.nextInt();
		 dispFact(n);
	} static void dispFact(int n){
		int d=n;
		for(int i=1;i<=n;i++){
			int val=getFactorial(i);
			System.out.println(i+"!="+val);
		}
	}

	public static int getFactorial(int n) {
		int f=1;
		while(n>0){
			f=f*n;
			n--;
		}
		return f;

	}
}




