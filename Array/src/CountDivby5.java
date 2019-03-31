import java.util.Scanner;

public class CountDivby5 {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("how many number u want to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter all the "+n+" values :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(arr[i]%5==0){
				count++;
			}
		}System.out.print("num div by 5 count is:"+count);
	}
}
