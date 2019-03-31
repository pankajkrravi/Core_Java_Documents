import java.util.Scanner;

public class DispitsLowerCase {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a character in Upper Csae:");
   char c=sc.next().charAt(0);
   System.out.println("YourEntred Upper Case Character is "+c);
   int temp=(int)c;
   temp=temp+32;
   c=(char)temp;
   System.out.println("Equivalent cahracter in lower Case :"+c);
   
	}

}
