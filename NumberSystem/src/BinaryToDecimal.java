import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number in binary form");
		int bin=sc.nextInt();
		int dec=binToDecimal(bin);
		System.out.println(+bin+" in Decimal form ="+dec);
	}
	String pow="";
	private static int binToDecimal(int bin) {
		int p=0,sum=0;
		while(bin!=0){
			int r=bin%10;
			r=r*getPower(2,p);
			sum=sum+r;
			p++;
			bin=bin/10;
		}
		return sum;
	}
	private static int getPower(int i, int p) {
		int pw=1;
		while(p>0)
		{
			pw=pw*i;
			p--;
		}
		return pw;
	}
}
