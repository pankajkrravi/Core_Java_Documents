import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String   name=sc.next();
		System.out.println("enter the roll number");
		int rollno=sc.nextInt();
		System.out.println("enter the four subject makrs");
		int phy=sc.nextInt();
		int che=sc.nextInt();
		int math=sc.nextInt();
		int bio=sc.nextInt();
		System.out.println("<=======REPORT CARD========>");
		System.out.println("-----------------------------");
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("-----------------------------");
		System.out.println("subject     max     min    obt");
		System.out.println("physics     100     40    "+phy);
		System.out.println("Chemistry   100     40   "+ che);
		System.out.println("Mathematics 100     40    "+math);
		System.out.println("Biology     100     40    "+ bio); 
		System.out.println("-------------------------------");
		System.out.println("Total       400     160 "+getTotal(phy,che,math,bio));
		System.out.println("--------------------------------");
		System.out.println("percentage :"+getTotal(phy,che,math,bio)/4.0);
		System.out.println("Result     :"+getResult(phy,che,math,bio));
		System.out.println("---------------------------------");

	}
	private static double getTotal(int phy,int che,int math,int bio)
	{
		return phy+che+math+bio;
	}
	public static String getResult(int phy,int che,int math,int bio)
	{

		if(phy<40||che<40||math<40||bio<40)
			return "FAIL";	
		else
		{
			double  per=getTotal(phy,che,math,bio)/4.0;
			if(per>=85)
				return "DISTENCTION";
			else if(per>=60)
				return "FIRST CLASS";
			else if(per>=50)
				return "SECOND CLASS";
			else {
				return "PASS";
			}
		}
	}
}

