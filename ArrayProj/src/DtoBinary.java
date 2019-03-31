import java.util.Scanner;

public class DtoBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int dec=sc.nextInt();
		String bin = detoBin(dec);
		System.out.println(dec+"is to binary conversion:"  +bin);
	}

	private static String detoBin(int dec) {
		String bin="";
		while(dec!=0){
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}
		return bin;
	}


}
