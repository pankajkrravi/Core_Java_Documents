package Assignment3;

import java.util.Scanner;

public class CountPositiveAndNeg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" how many number u want"); 
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter your " +n+" values");
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
      positiveneg(ar);
		  
	}

	private static void positiveneg(int[] ar) {
		int neg=0;
		int pos=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]<0){
				neg=neg+1;
			}
			else
				pos=pos+1;
		}
		 System.out.println("the neg num is: "+neg);
		   System.out.println("tne positivr=e num is :"+pos);
	}
}
