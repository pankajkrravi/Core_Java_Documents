import java.util.Scanner;
class SumOfGivenCMDLineArguments{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("sum of "+a+" and "+b +"is "+sum);
	}
}