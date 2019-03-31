import java.util.Scanner;

public class CountEvenAndOdd {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter how many number u want"); 
			int n=sc.nextInt();
			int ar[]=new int[n];
			System.out.println("enter your " +n+" values");
			for(int i=0;i<n;i++){
				ar[i]=sc.nextInt();
			}
		int c[]=gerOddEven(ar);
		System.out.println("no of even num is :"+c[0]);
		System.out.println("no fof odd num is  "+c[1]);
	}
	private static int[] gerOddEven(int[] a) {
		int c[]=new int[2];
		for(int i=0;i<a.length;i++){
			c[a[i]%2]++;
		}
		return c;
	}

}
