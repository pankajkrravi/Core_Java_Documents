package Assignment2;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int count=0;
		int x[]=.readArray();
		for(int )
	}
	static int [] readArray()
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
	static int armstrongno(int  ar[i]) 
	{
		int num2,p,sum=0;
		num2=num1;

		while(num2>0)

		{
			p=(num2)%10;
			num2=num2/10;
			sum=sum+(p*p*p);


		}
		if (sum==num1)
			return 1;

		else

			return 0;

	}


}

