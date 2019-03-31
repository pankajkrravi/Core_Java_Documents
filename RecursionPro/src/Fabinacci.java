import java.util.Scanner;

public class Fabinacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		fabonacci(num);
		System.out.println("fibonacci series:"+fabonacci(num));
	}

	private static int fabonacci(int num) {
		if(num ==0){
			return 0;
		}
		if(num==1){
			return 1;
		}
		else {
			return fabonacci(num-1)+fabonacci(num-2);
		}
	}


}
