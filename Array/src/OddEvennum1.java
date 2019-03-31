import java.util.Scanner;

public class OddEvennum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many number u want to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int evencount = 0, oddcount = 0;
		System.out.println("enter all the "+n+" values :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("even numbres are:");
		for(int i=0;i<n;i++)
		{    
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
				evencount++;
			}
		}System.out.println();
		System.out.print("Odd numbers are :");
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i] % 2 != 0)
			{  
				System.out.print(arr[i]+" ");
				oddcount++;
			}
		}System.out.println();
		    System.out.println("even count is:"+evencount);
		    System.out.println("odd count is :"+oddcount);

	}
}
