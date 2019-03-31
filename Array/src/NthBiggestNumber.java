
public class NthBiggestNumber {

	public static void main(String[] args) {
		int a[]={23,56,40,69,89,44};
		int ele=nthBiggest(a);
		System.out.println(ele);
	}
	private static int nthBiggest(int[] a) {
		for(int i=0;i<a.length;i++)
		{  int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					count ++;
				}
				if(count==5-1)
					return a[i];
			}
		}
		return 0;
	}

}
