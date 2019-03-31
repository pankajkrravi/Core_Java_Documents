import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int dec=sc.nextInt();
		String hex=decToHex(dec);
		System.out.println(dec+"in hexadecimal is: "+hex);
	}

	static String decToHex(int dec) {

		String hex="";
		while(dec!=0){
			int r=dec%16;
			if(r<10)
				hex=r+hex;
			else
				hex=(char)(r+55)+hex;
			dec=dec/16;
		}
		return hex;
	}
}


