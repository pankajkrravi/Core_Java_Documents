import java.util.Scanner;

public class BinaryToDec {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);	
System.out.println("enter any binaryy digit");
int n=s.nextInt();
int val=getDecimal(n);
System.out.println(val);
}
	static int getDecimal(int bin){
		int pwr=0;int sum=0;
		while(bin!=0){
			int r=bin%10;
			r=r*getPower(2,pwr);
		sum=sum+r;
		pwr++;
		bin=bin/10;
		}
		return sum;
	}
		static int getPower(int x,int y){
			int pw=1;
			while(y>0){
				pw=pw*x;
				y--;
			}
			return pw;
		}
	}

