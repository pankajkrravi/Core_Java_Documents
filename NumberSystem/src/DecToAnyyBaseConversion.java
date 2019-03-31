import java.util.Scanner;

public class DecToAnyyBaseConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		int dec=sc.nextInt();
		System.out.println("Enter the base");
		int base=sc.nextInt();
		String any=decToBase(dec,base);
		System.out.println(+dec+"and "+base+" = "+any);
	}

	private static String decToBase(int dec, int base) {
		String con="";
		while(dec!=0)
		{
			int r=dec%base;
           if(r<10)
        	   con=r+con;
           else
        	   con=(char)(r+55)+con;
        	   dec=dec/base;
		}
		return con;
	}

}
