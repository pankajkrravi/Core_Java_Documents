import java.util.Scanner;

public class DispposAndnegNum {
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
		for(int i=0;i<num;i++)
		{
			if(arr[i]>0){
				System.out.println("Positive num= "+arr[i]);
			}
			else
				System.out.println("negative num= "+arr[i]);
		}
	}

}
