import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hour and min time");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		//sc.close();
		cloclAngle(hr,min);
	}
	static void cloclAngle(int hr, int min) {
		double hour=hr*30+min*0.5;
		double minute=min*6;
		double angle=0;
		if(hour>minute)
			angle=hour-minute;
		else
			angle=minute-hour;
		if(angle>180){
			angle=360-angle;
		}	
		System.out.println("larser angle b/w "+hr+ "and "+min+" "+angle);
	}
}
