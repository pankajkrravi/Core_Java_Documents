import java.util.Scanner;
public class ReadStudentsMarksAndDispTotalAvgGradeRem {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter Three Subject Marks");
		float  m1=s.nextInt();
		float m2=s.nextInt();
		float m3=s.nextInt();
		float total=m1+m2+m3;
		float avgmarks=(total)/3;
		System.out.println("   Your  Total Marks Scored ="+total);
		System.out.println(" Average of three sub marks=" +avgmarks);
		System.out.println("<========Student mrks Sheet=============>");
		System.out.println   ("<=====Grade=========Remarks=========>");
		if(m1<50||m2<50||m3<50)
			System.out.println("      E           Failure,Try Again ");
		else if(avgmarks>=80)
			System.out.println("      A           Excellent          ");
		else if(avgmarks>=70)
			System.out.println("      B            Very Good         ");
		else if(avgmarks>=60)
			System.out.println("      C            Goog              ");
		else if(avgmarks>=50)
			System.out.println("      D            Satisfactory     ");
	}
}
