import java.util.Scanner;

public class DispMinAmgThreeIp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a<b&&a<c)
			System.out.println("Min number ="+a);
		else if(b<c&&b<a)
			System.out.println("Minumum number"+b);
		else
			System.out.println("Minimum number ="+c);
	}

}
