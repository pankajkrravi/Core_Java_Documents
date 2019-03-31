import java.util.Scanner;

public class ArrayOeration {
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
	void dispArray(int ar []){
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");   
		}
		System.out.println();
	}
	int [] mergeArray(int x[],int y[])
	{
		int[] z=new int[x.length+y.length];
		for(int i=0;i<x.length;i++){
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}
	public void reverse(int[] x) {
		for(int i=0;i<x.length/2;i++){
			int t=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=t;
		}
	}

























}

}
