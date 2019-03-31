/* WAP to Read a String value from user and display it.
 * 
Following methods of Scanner class are used in the program:
1) nextInt to input an integer
2) nextFloat to input a float
3) nextLine to input a string
 */

import java.util.Scanner;
public class ReadString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String values :");
		String s=sc.nextLine();
		System.out.println("Your Entred String Values is :");
		System.out.println(s);
	}

}
