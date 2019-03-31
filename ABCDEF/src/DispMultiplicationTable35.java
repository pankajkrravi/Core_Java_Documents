import java.util.Scanner;

public class DispMultiplicationTable35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number to get multiplication table");
		int x=sc.nextInt();
		for(int i=x;i<=x;i++)
		{
			for(int j=1;j<=10;j++)
			{
                 System.out.println(+i+"*"+j+"="+i*j);
			}
		}
	}
}
