package Assignment2;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) 
	{
		Scanner c=new Scanner(System.in);
		System.out.println("enter how many array element:");
		int n=c.nextInt();
		int ar[]=new int[n];
		System.out.println("enter all "+n +" elements");
		int count=0;
		for(int i=0;i<ar.length;i++){
			ar[i]=c.nextInt();
			int rs=dispPerfectNum(ar[i]);
			if(rs==1){
				count++;
			}
		}
		System.out.println(count);
	}
	static int dispPerfectNum(int num){
		int sum=0,count=0;
		for(int i=1;i<num/2;i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(sum==num){
			count++;

		}
		return count;
	}

}