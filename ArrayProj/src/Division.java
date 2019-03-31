import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for count no of divisior");
		int num =sc.nextInt();
		int count=getNumberOfDivisior(num);
		System.out.println("Number of Divisiors "+num+"is"+count);
	}
	static int getNumberOfDivisior(int x)
	{ 
		int c=1,i=1;
		while(i<=x/2)
		{
			if(x%2==0)
				c++;
			i++;
		}
		return c;
	}
}


