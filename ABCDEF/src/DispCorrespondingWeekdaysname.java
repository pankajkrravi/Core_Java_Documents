import java.util.Scanner;

public class DispCorrespondingWeekdaysname {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ente [0-6] to knuw corresponding Weekdays name");
    int d=sc.nextInt();
    if(d==0)
    	System.out.println("Weeks day's name is SUNDAY");
    else if(d==1)
    	System.out.println("Weeks day's name is MONDAY");
    else if(d==2)
    	System.out.println("Weeks day's name is TUESDAY");
    else if(d==3)
    	System.out.println("Weeks day's name is WEDNESDAY");
    else if(d==4)
    	System.out.println("Weeks day's name is THURSDAY");
    else if(d==5)
    	System.out.println("Weeks day's name is FRIDAY");
    else if(d==6)
    	System.out.println("Weeks day's name is SATURDAY");
    else
    	System.out.println("INVALID INPUT  ");
	}

}
