import java.util.Scanner;

public class Specialno {
	public static void main(String[] args) {
		int p,s1=0,s2=1,sum=0,num1;
		System.out.println("ENTER THE NO ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		num1=num;
		while(num1>0)
		{
			p=num1%10;
			s1=s1+p;
			s2=s2*p;
			num1=num1/10;
		}
		sum=sum+(s1+s2);
		if(sum==num)
			System.out.println("The no is Special  "+num);
		else
			System.out.println("The no is not Special  "+num);
		
		
	}

}
