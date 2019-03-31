import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		System.out.println("enter your age");
		Scanner sc= new Scanner(System.in);
		int age =sc.nextInt();
		if(age>=18){
			System.out.println("eligible to vote");
		}
		else{
			System.out.println("not eligible to vote");
		}System.out.println("thank you");
		
	}  
}
