import java.util.Scanner;

public class DispMaxOthreeIp {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter three numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("Maximim number ="+a);
		else if(b>a&&b>c)
			System.out.println("Maximum number = "+b);
		else
			System.out.println("Maximum number ="+c);
	}
}





















/*int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max=a;
if(max<b)
	max=b;
if(max<c)
	max=c;
return max;*/