import java.util.Scanner;

public class DigitsInnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to display no of digits");
		int num=sc.nextInt();
		 int count=1;
		 int temp=num;
		 for(int i=1;i<=num;i++)
		 {
			 int r=num%10;
			 count++;
			 num=num/10;
		 }
		 System.out.println("In number "+temp +" total no of digits="+count);
	}

}
