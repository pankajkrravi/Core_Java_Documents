import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int dec=sc.nextInt();
		String hex = dectoHex(dec);
		System.out.println(dec+"is to Octal conversion:"  +hex);
	}
	private static String dectoHex(int dec) {
		String hex="";
		while(dec!=0){
			int r=dec%16;
			if(r<10) 
				hex=r+hex;
			else{
				hex=((char)(r+55)+hex);
				dec=dec/16;
			}
		}
		return hex;
	}

}
