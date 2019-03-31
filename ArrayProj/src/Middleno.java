import java.util.Scanner;

public class Middleno {
	public static void main(String args[])
	{
		int b=middlenos();
		System.out.println("The Middle no is " + b);
	}
	static int middlenos() 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("\n enter three nos");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if((num2>num1 && num1 > num3 ) ||(num3>num1 && num1>num2 ))
			return num1;
		if((num1>num2 && num2>num3) ||(num3>num2 && num2>num1))
			return num2;
		if((num1>num3 && num3>num2)||(num2>num3 && num3>num1))
			return num3;
		return num3;
	}

}