
public class MainRunnerDate {
	public static void main(String[] args) {
		Date d1=new Date(25,07,1996);
		Date d2=new Date(2,3,2018);
		int days=numberofDays(d1,d2);
		System.out.println("no of days between "+d1+"And "+d2+" is "+days);
	}

	private static int numberofDays(Date d1, Date d2) {
		int x=d1.totalDays();
		int y=d2.totalDays();
		if(x>y)
			return x-y;
		else 
			return y-x;
	}

}
