import java.util.Scanner;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		String hex=decToHexadecimal(num);
		System.out.println(+num+" is in Hexadecimal"+hex);
	}
	String hex="";
	private static String decToHexadecimal(int num) {
		while(num!=0)
		{
			int r=num%16;
			num=r+num;
			if(r<10)
			{

			}
			else
			{
				switch(r)
				{
				case: 10.num='A'+num;
				case:11.
				}
			}
			return null;
		}
	}
}
