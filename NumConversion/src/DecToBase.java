import java.util.Scanner;

public class DecToBase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int dec=sc.nextInt();
		System.out.println("enter base");
		int base=sc.nextInt();
		String c=convert(dec,base);
		System.out.println(dec+"in "+base+"base is:"+c);
	}

	private static String convert(int dec, int base) {
		String st="0123456789ABCDEF";
		String con="";
		while(dec!=0){
			int r=dec%base;
			con=st.charAt(r)+con;
			dec=dec/base;
		}return con;
	}

}
