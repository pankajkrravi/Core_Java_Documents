import java.util.Scanner;

public class DecToOctal {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   int num=sc.nextInt();
   String  oct=decToOctal(num);
   System.out.println(+num+ " in octal form ="+oct);
	}
	private static String decToOctal(int num) {
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
