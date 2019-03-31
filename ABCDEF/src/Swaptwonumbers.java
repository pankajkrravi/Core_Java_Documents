import java.util.Scanner;
public class Swaptwonumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two int numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap a ="+a+ " b = "+b);
		int temp;
		temp=a;//10
		a=b;//20
		b=temp;//10
		System.out.println("After swap  a ="+ a +"  b ="+b);
	}
}
