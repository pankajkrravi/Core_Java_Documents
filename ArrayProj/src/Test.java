
public class Test {
	public static void main(String[] args) {
		int m1=50,m2=56,m3=90,m4=65;
		char rs=getGrade(m1,m2,m3,m4);
		System.out.println("grade is"+rs);
		int a=0,b=0,c=0,d=0;
		char rs1=getGrade(a,b,c,d);
		System.out.println("grade is"+rs1);
		int x=55,y=88,z=85,w=66;
		char ch=getGrade(x,y,z,w);
		System.out.println("grade is"+ch);

	}
	static char getGrade(int m1,int m2,int m3,int m4){
		char grade;
		if(m1<40||m2<40||m3<40||m4<40)
		{
			grade='F';//return F
		}
		else{
			double per=(m1+m2+m3+m4)/4.0;
			if(per>=80)
				grade='A';
			else if(per>=60)
				grade='B';
			else if(per>=50)
				grade='c';
			else
				grade='D';

		}
		return grade;
	}
}



