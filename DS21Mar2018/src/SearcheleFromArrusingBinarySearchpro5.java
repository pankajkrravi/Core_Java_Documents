import java.util.Scanner;

public class SearcheleFromArrusingBinarySearchpro5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many num u want to enter in array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter "+n+" val in sorted form");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt(n);
		}
		System.out.println("which ele u want so search");
		int s=sc.nextInt();
		System.out.println("from which index u want to search");
		int f=sc.nextInt();
		int in=binarySearch(arr,s,f,arr.length-1);
		if(in>0)
			System.out.println("element present in "+in+" index");
		else
			System.out.println("element not pesent");
	}

	private static int binarySearch(int[] arr, int ele, int f, int l) {
		int mid=(f+l)/2;
		if(mid<0||mid>arr.length)
			return -1;
		if(arr[mid]==ele)
			return mid;
		if(arr[mid]<ele)
			return binarySearch(arr,ele,mid+1,l);
		else
			return binarySearch(arr,ele,f,mid-1);
	}
}
