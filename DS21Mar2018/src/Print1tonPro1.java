import java.util.Scanner;

public class Print1tonPro1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lat num to print ");
		int n=sc.nextInt();
		print(n);
	}
	static void print(int n){
		if(n>0){
			print(n-1);
			System.out.println(n);
		}
	}
}
