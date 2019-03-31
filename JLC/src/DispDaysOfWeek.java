import java.util.Scanner;

public class DispDaysOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 0 to 6 to know  Days:");
		int x=sc.nextInt();
		if(x==0)
			System.out.println(x+"  Sunday");
		else if(x==1)
			System.out.println(x+"  Monday");
		else if(x==2)
			System.out.println(x+"  Tuesday");
		else if(x==3)
			System.out.println(x+"  Wednesdy");
		else if(x==4)
			System.out.println(x+"  Thureday");
		else if(x==5)
			System.out.println(x+"  Friday");
		else if(x==6)
			System.out.println(x+"  Saturday");
		else
			System.out.println(x+"  Invalid input");
	}

}
