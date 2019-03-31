import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		boolean lyear=isLeapyear(y);
		System.out.println(lyear);
	}

	private static boolean isLeapyear(int y) {
		{
			return y%400==0||(y%4==0&&y%100!=0);
		}
	}
}


