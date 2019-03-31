import java.util.Scanner;

public class StringPalindrom {
   public static void main(String[] args) {
	   String rev="";
	   System.out.println("enter the input string");
	Scanner sc=new Scanner(System.in);
	String org=sc.nextLine();
	for(int i=org.length()-1;i>=0;i--){
		rev=rev+org.charAt(i);
	}
	if(org.equals(rev)){
		System.out.println("string is palindrom:");
	}
	else{
		System.out.println("given string in not palindrom");
	}
}    
}
