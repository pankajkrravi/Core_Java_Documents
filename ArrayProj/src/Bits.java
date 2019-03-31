import java.util.Scanner;

public class Bits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to count"); 
		int no=sc.nextInt();
		int ct=getCount(no);
		System.out.println( "bits is " +ct);
	}

	static int getCount(int no)
	{
		int count =0;
		{
			while(no%2==1);
			count++;
			no=no/2;
		}
		return count;
	}
}

