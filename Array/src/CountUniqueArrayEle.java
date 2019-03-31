
public class CountUniqueArrayEle {

	public static void main(String[] args) {
		int ar[]={23,45,56,23,56,78,56,12};
		System.out.println();
		ar=getUniqueArray(ar);
		for(int i=0;i<ar.length;i++){
			System.out.println("unique element is: "+ar[i]);
		}
			}

	private static int[] getUniqueArray(int[] a) 
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
		}
		int na[]=new int[n];

		for(int i=0;i<n;i++){
			na[i]=a[i];
		}
		return na;
	}

}
