import java.util.Scanner;

public class DtoOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int dec=sc.nextInt();
		String oct = dectoOctal(dec);
		System.out.println(dec+"is to Octal conversion:"  +oct);
	}
	static String dectoOctal(int dec) {
		String oct="";
		while(dec!=0){
			int r=dec%8;
			oct =r+oct;
			dec=dec/8;
		}
		return oct;
	}
}
