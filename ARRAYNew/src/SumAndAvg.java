public class SumAndAvg {
	public static void main(String[] args) {
		int ar[] = new int[5];
		ar[0]=45;
		ar[1]=20;
		ar[2]=55;
		ar[3]=33;
		ar[4]=30;
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println(" Sum ="+sum);
		System.out.println("Average="+sum/5.0);
	}
}
