import java.util.Scanner;
// cal sum 
public class DispSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Your entred number is a= "+a +", b =" +b);
		int z;
		z=a+b;
		System.out.println("Addition of two numbers ="+z);
	}

}
