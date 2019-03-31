import java.util.Scanner;

public class AscciChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number b/w 1 to 28");
		int i=sc.nextInt();
		for( i=1;i<=28;i++)
		{
			System.out.println(i+"=====>"+(char)i);
		}

	}
}
