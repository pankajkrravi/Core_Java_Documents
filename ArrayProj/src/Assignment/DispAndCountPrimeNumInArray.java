package Assignment;
import java.util.Scanner;
public class DispAndCountPrimeNumInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many num you want to enter");
		int num=sc.nextInt();
		int arr[]=new int [num];
		System.out.println("enter "+num+" values");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=1;i<=arr.length;i++)
		{
			if(arr[i]%i==0)
				count++;
			if(count==2)
				System.out.println(+arr[i]+" is a prime num "+count);
		}
	}
}
