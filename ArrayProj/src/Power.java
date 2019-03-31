import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two num ");
		int n=sc.nextInt();
		int p=sc.nextInt();
		int v=pow(n,p);
		System.out.println(+v);
	} private static int pow(int n,int p) {
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
}


