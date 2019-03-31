import java.util.Scanner;

public class ReturnAvg2 {
	double   calcAvg()
	{    double avg=0.0;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many number u want to enter to cal average");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("Enter all "+n+" Values: ");
	for(int i=0;i<n;i++){
		ar[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<n;i++){
		sum=sum+ar[i];
		avg=sum/(double)n;
	}
	return avg;
	}

}
