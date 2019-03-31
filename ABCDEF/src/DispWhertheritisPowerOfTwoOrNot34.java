import java.util.Scanner;

public class DispWhertheritisPowerOfTwoOrNot34{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number ");
		int x=sc.nextInt();
		if(x%2==0||x==1)
			System.out.println(+x+" is a power of 2");
		else
			System.out.println(+ x +" is not a power of 2");
	}
}
