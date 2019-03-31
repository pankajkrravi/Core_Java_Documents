
public class MergeShortedArr {

	public static void main(String[] args) {
		int x[]={21,36,78,89,92};
		int y[]={1,32,32,52}; 
		int rs[]=merge(x,y);
		for(int i=0;i<x.length+y.length;i++)
		{
		System.out.println(rs[i]);
		}
	}

	private static int[] merge(int[] x, int[] y) {
		int rs[]=new int[x.length+y.length];
		int k=0,i=0,j=0;
		while(i<x.length&&j<y.length){
			if(x[i]<y[j]){
				rs[k]=x[i];
				i++;
			}
			else{
				rs[k]=y[j];
				j++;
			}
			k++;
		}
		while(j<y.length){
			rs[k]=y[j];
			k++;
			j++;
		}
		while(i<x.length){
			rs[k]=x[i];
			k++;
			i++;

		}
		return rs;

	}
}
