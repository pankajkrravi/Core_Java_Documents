import java.util.Scanner;

public class BiggestAmgThreeNumber {

	public static void main(String[] args) {

		int bnum=biggestNumber();
		System.out.println("The biggest number is: "+bnum);
	}

	static int biggestNumber() 

	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3  number to check biggest amoung them");
		int  num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();

		if(num1>num2)
		{
			if(num1>num3)
			{
				return num1;
			}
		}
		if(num2>num3)
		{
			return num2;
		}
		else
			return num3;
	}
}
