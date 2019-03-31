public class CuntOccurance {

	public static void main(String[] args) {
		int []ar={23,25,29,23,66,88,90};
		for(int i=0;i<ar.length;i++){
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
					count++;
			}
			System.out.println(ar[i]+" occured in array is: "+count);

		}
	}
}
