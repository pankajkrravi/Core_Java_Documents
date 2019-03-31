package Pattprsctice;

import java.util.Scanner;

public class dectohexadecimalmay8 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter decimal number");
    int num=sc.nextInt();
    String hex=dectohexadecimal(num);
    System.out.println(num+" is in hexadecimal = "+hex);
}
	private static String dectohexadecimal(int num)
	{
		String hex="";
		while(num!=0)
		{
			int r=num%16;
			if(r<10)
			{
				hex=r+hex;
			}
			else
			{
				switch(r)
				{
				case 10:hex='A'+hex;
				break;
				case 11:hex='B'+hex;
				break;
				case 12:hex='C'+hex;
				break;
				case 13:hex='D'+hex;
				break;
				case 14:hex='D'+hex;
				break;
				case 15:hex='F'+hex;
				break;
				}
			}
			num=num/16;
		}
		return hex;
	}

}
