import java.util.Scanner;

public class CountWordsInString
{ 
	public static void main(String args[])
	{ 
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your sentance");
		
		String s =scn.nextLine();

		int count = 1;

		for (int i =0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;

			}
		}
		System.out.println("Number of words in your sentanse = " + count);
	}
}

