
public class GetBiggestNum {

	public static void main(String[] args) {
		int ar[]={10,12,50,60,100,120,150};
		int big=getBiggestNum(ar);
		System.out.println("biggest number is: "+big);
	}

	private static int getBiggestNum(int[] a) {
		int b=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(b<a[i])
				b=a[i];
		}
		return b;
	}
}

