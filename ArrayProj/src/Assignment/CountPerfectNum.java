package Assignment;
import java.util.Scanner;
public class CountPerfectNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many nu  u want to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter all "+n+ " values");
		int count=0,sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]%i==0)
			{
				sum=sum+i;
				count++;
			}
		}
		if(sum==arr[i])
			System.out.println(+n+" is Perfect num & count="+count);
	}

}
