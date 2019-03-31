import java.util.Scanner;

public class OddDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ente thre number to count odd digits");
		int input=sc.nextInt();
	        while (input > 0) {
	            if (input % 2!= 0) {
	                System.out.println(input % 10 + " is odd");
	            }
	            input = input / 10;
	        }
	    }
	}



