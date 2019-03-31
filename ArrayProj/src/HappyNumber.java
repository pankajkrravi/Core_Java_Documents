import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		boolean  rs=isHappy(no);
		if(rs)
			System.out.println(no+ "  is happy num");
		else
			System.out.println(no+ "  is not a happy num");
	}

	private static boolean isHappy(int no) {
		while(no>9){
			no=getSumSqDigits(no);
		}
		return no==7||no==1;
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



