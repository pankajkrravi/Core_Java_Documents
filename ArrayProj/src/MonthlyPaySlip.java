import java.util.Scanner;

public class MonthlyPaySlip {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.next();
		System.out.println("Enter youe Employeeid");
		String email=sc.next();
		System.out.println("enter your Basic salary");
		int bsal=sc.nextInt();
		System.out.println("<======MONTHLY PAYSLIP======>");
		System.out.println("-----------------------------");
		System.out.println("Name       :"+name);
		System.out.println("Employ id  :"+email);
		System.out.println("-----------------------------");
		System.out.println("Basic salary :"+bsal );
		System.out.println("HRA          :"+0.15*bsal);
		System.out.println("TA           :"+0.20*bsal);
		System.out.println("DA           :"+0.70*bsal);
		System.out.println("Convention   :"+0.08*bsal);
		System.out.println("------------------------------");
		System.out.println("Gross salary :"+grossSal(bsal));
		System.out.println("Deductions   :"+getDeductions(bsal));
		System.out.println("net salary   :"+(grossSal(bsal)-getDeductions(bsal)));
		
	} 
	static double grossSal(double sal){
		double gsal;
		gsal=sal+(0.15+0.20+0.70)*sal;
		return gsal;
	}
	static double getDeductions(int sal){
		double ded,gsal;
		gsal=sal+(0.15+0.20+0.70)*sal;
		ded=gsal-((0.17+0.50+0.10)*gsal-(200+200));
		return ded;
	}

}
