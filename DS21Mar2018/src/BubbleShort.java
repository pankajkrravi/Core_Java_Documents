import java.util.Scanner;
public class BubbleShort {
	public static void main(String[] args) {
		/*	Scanner c=new Scanner(System.in);
		System.out.println("enter how many array element:");
		int n=c.nextInt();
		int ar[]=new int[n];
		System.out.println("enter all "+n +" elements");
		for(int i=0;i<ar.length;i++){
			ar[i]=c.nextInt();
		}
		 */
		int n=5;
		int i,j;
		int ar[]={50,40,30,20,10};
		for( i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}

		}
	}
}