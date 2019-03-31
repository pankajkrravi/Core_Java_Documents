import java.util.Scanner;

public class ReadAYearDispitisLeapyearOrNot {
	public static void main(String[] args) {
		Scanner y=new Scanner(System.in);
		System.out.println("Enter a year of of wish:");
		int year=y.nextInt();
         if(year%4==0||year%400==0)
        	 System.out.println(+year+" is a Leap Year");
         else
        	 System.out.println(+year+" is not a Leap Year");
	}
}
