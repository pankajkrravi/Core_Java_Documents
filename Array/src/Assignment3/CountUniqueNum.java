package Assignment3;
public class CountUniqueNum {
	int []arr={11,11,12,11,44,20,10,11,10,50};
	private static void uniqueArray(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			boolean uniqueArray=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					uniqueArray=true;
					break;
				}
			}
			if(uniqueArray)
				System.out.println(a[i]+" ");
		}
	}
}