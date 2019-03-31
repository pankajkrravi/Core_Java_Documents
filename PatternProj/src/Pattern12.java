import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		System.out.println("enter no of lines ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}
		
	}

}
