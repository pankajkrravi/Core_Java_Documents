import java.util.Arrays;
import java.util.Scanner;

public class AnaggramOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two words");
     String s1=sc.nextLine();
     String s2=sc.nextLine();
     System.out.println(isAnagram(s1,s2));
	}
	public static boolean  isAnagram(String s1,String s2){
		char[]ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}

}
