import java.util.Scanner;

public class ReadANumberDispFirstNaturalNumber {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Number ");
   int n=sc.nextInt();
   System.out.println("First "+n+" natural numbers is ");
   for(int i=1;i<=n;i++)
	   System.out.println(+i);
	}
}
