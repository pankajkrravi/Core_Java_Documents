import java.util.Scanner;

public class ReadaCharDispitisViwelOrConsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character to check is it vowel or consonant");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println("Character "+c+" is a Vowel" );
		else
			System.out.println( "Entred  Character is a Consonant");
	}

}
