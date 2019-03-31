
public class MaergeTwoArrayInZigZag {

	public static void main(String[] args) {
		int a[]={56,78,18,89,32,59};
		int b[]={28,52,17,12};
		int c[]=zigZag(a,b);
		System.out.println();
	}
	private static int[] zigZag(int[] x, int[] y) {
		int rs[]=new int[x.length+y.length];
		int i=0,j=0;
		for(;i<x.length&&i<y.length;i++,j++){
			rs[j]=x[i];
			j++;
			rs[j]=y[i];
		}
		for(;i<y.length;i++,j++){
			rs[j]=y[i];
		}
		for(;i<x.length;i++,j++){
			rs[j]=x[i];
		}
		return rs;
	}

}
