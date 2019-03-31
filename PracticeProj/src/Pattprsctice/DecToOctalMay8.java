package Pattprsctice;

import java.util.Scanner;

public class DecToOctalMay8 {
	public static void main(String[] args) {
	Scanner ssc=new Scanner(System.in);
	System.out.println("Enter decimal number");
	int num=ssc.nextInt();
	String oct=dectooctal(num);
	System.out.println(num+" is in octal = "+oct);
}
	private static String dectooctal(int num)
	{
		String oct="";
		while(num!=0)
		{
			int r=num%8;
			oct=r+oct;
			num=num/8;
		}
		return oct;
	}
}

