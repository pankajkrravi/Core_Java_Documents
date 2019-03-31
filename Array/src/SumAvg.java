
public class SumAvg {

	public static void main(String[] args) {
		int ar[];
		ar=new int[5];
		ar[0]=45;
		ar[1]=28;
		ar[2]=49;
		ar[3]=69;
		ar[4]=18;

		int sum=0;
		for(int i=0;i<5;i++){
			sum=sum+ar[i];
		}
		System.out.println("sum of values is :"+sum);
		System.out.println("average og 5 values is :"+sum/5.0);
	}

}
