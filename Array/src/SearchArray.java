import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("ente the no to be searched");
		int num=sc.nextInt();
		int b=search(a,num);
		System.out.println("array at position: "+b);
	}

	private static int search(int[] a, int num) {
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				return i+1;
			}
		}
		return 0;
	}

}
