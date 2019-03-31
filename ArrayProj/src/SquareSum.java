import java.util.Scanner;

public class SquareSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nu to count square sum");
		int n=sc.nextInt();
		int ss=getSumSqDigits(n);
		System.out.println("sum of square digit is :"+ss);
	}

   static int getSumSqDigits(int n) {
		int sum=0;
		do{
			int r=n%10;
			sum=sum+getSquare(r,2);
			n=n/10;
		}while(n!=0);
			return sum;			
	}
static int getSquare(int x,int y){
	int pw=1;
	while(y>0){
		pw=pw*x;
		y--;
	}
	return pw;
}
}
