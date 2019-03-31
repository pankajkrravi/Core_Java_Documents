import java.util.Scanner;

//WAJP to read one char value from user and display it.
public class ReadOneCharValDispit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character value :");
		char c=sc.next().charAt(0);
		System.out.println("your lucky characer is :"+c);
	}

}
