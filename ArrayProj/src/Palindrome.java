import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbe to check is it palindrome or not");
		int n=sc.nextInt();
		int  rs=isPalindrome(n);
		if(rs==n)
			System.out.println(n+"is palindrome");
		else
			System.out.println(n+"is not a palindrome");
	}static int isPalindrome(int n)  {

		int rs=0;
		do{
			int x=n%10;
			rs=rs*10+x;
			n=n/10;
		}while(n!=0);
		return rs;


	}
}




