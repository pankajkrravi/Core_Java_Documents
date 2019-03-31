import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		Strong sg=new Strong();
		boolean rs=sg.isStrong(n);
		if(rs)
			System.out.println(n+"is a strong number");
		else
			System.out.println(n+"is not a Strong number");
	}

}
