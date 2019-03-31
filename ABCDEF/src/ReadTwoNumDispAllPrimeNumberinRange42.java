import java.util.Scanner;

public class ReadTwoNumDispAllPrimeNumberinRange42{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower range numbers");
		int n=sc.nextInt();
		System.out.println("Enter upper range number");
		int m=sc.nextInt();
		int val;
		int count=0;
		for(int i=1;i<=m;i++)
		{
			val=getPrime(i);
			System.out.println("-------------------");
			if(val==2)
				count++;
		}
	}

	private static int getPrime(int i) {
		int cont=1;
		for(int j=1;j<=(i/2);j++)
			if(i%j==0)
	}

}
