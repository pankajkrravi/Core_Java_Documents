package Assignment3;

import java.util.Scanner;

public class SmallestEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" how many number u want"); 
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter your " +n+" values");
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		int small=smallestNum(ar);
		System.out.println("Smallest number from array is: "+small);
	}

	private static int smallestNum(int[] a) {
		int small=a[0];
		for(int i=0;i<a.length;i++){
			if(small>a[i])
				small=a[i];
		}
		return small;
	}

}
