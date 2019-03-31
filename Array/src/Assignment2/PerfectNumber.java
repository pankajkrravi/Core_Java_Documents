package Assignment2;

import java.util.Scanner;

public class PerfectNumber {
	int [] readArray()
	{
		Scanner c=new Scanner(System.in);
		System.out.println("enter how many array element:");
		int n=c.nextInt();
		int ar[]=new int[n];
		System.out.println("enter all "+n +" elements");
		for(int i=0;i<ar.length;i++){
			ar[i]=c.nextInt();
		}
		return ar;
	}
	int dispPerfectNum(int ar[]){
		int sum=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]%i==0){
				sum=sum+i;
			}
		}
		return sum;
	}

}
