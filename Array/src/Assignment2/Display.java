package Assignment2;

import java.util.Scanner;

public class Display {
public static void main(String[] args) {
	int rs[]=dispEvenAndOdd();
		System.out.println("even count is "+rs[0]);
		System.out.println("odd count is "+rs[1]);
}
static int[] dispEvenAndOdd(){
		Scanner sc=new Scanner(System.in);
		System.out.println("how many number u want to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter all the "+n+" values :");
		int  ec=0;int oc=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		  if(arr[i]%2==0){
			ec++;
		}
		else
			oc++;
		
	}
		int a[]=new int[]{ec,oc};
		return a;
}
}