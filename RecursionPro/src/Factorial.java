import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to find factorial :");
		int num=sc.nextInt();
		factorial(num);
		System.out.println("factrorai is:"+factorial(num));
	}

	private static int factorial(int num) {
	 if(num==0||num==1){
		 return 1;
	 }
	 else{
		 return num*factorial(num-1);
	 }
	}

}
