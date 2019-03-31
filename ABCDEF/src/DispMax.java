import java.util.Scanner;
public class DispMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number to find maximun");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println(+a+ "is Maximum");
		else
			System.out.println(+b +" is Maximum");
	}
}
