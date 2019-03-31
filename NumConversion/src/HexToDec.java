import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hexadecimal number");
		String hx=sc.next();
		int mm=hexToDeec(hx);
	}

	private static int hexToDeec(String hex) {
		int p=0,sum=0,i=hex.length()-1;
		while(i>=0){
			char ch=hx.charAt(i);
			i--;
			if(ch>'0'&&ch<'9')
				sum=sum+(ch-48)*pow(16,p);
			else if(ch>='a'&& ch<='f')
			sum=sum+(ch-87)*pow(16,p);
			p++;
		}return sum;

	}
}


