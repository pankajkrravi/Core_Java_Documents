import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num u want to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++)
		{
			System.out.print(i+1+"=");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n/2;i++)
		{
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
