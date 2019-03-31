import java.util.Scanner;

public class EligibleForVoteOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>18)
			System.out.println(" Your are Eligible for Vote");
		else
			System.out.println("Sorry You are not eligile for vote");
		System.out.println(   "Tnank you.........");
	}


}
