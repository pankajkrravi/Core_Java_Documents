import java.util.Scanner;

public class MultipleTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Entar your number for multiplication");
		int n=sc.nextInt();
		dispMul(n);
		System.out.println("Thank you");
	}
	static void dispMul(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"*"+i+"="+x*i);
		}
	}

}
