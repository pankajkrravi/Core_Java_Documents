import java.util.Scanner;

public class CountNoOfDidit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to count digits");
		int c=sc.nextInt();
		int count=countNoOfDigits(c);
		System.out.println("the count digits are" +count);
	}
	static int countNoOfDigits(int x)
	{
		int dc=0;
		do{ 
			dc++;
			x=x/10;
		}
		while(x!=0);
		return dc;
	}
}


