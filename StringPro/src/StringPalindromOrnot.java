import java.util.Scanner;

public class StringPalindromOrnot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your sentance");

		String s =scn.nextLine();
		boolean st=isPalindrom(s);
		if(st)
		System.out.println(" word is palindrom");
		else
			System.out.println(" word is not a palindrom");
	}

	private static boolean isPalindrom(String s) {
		int i=0;
		while(i<s.length()/2)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
			i++;
		}
		return true;
	}
}
