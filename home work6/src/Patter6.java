import java.util.Scanner;

public class Patter6 {
	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter no of rows");	
        n=sc.nextInt();
        int k=1;
        int p=1;
        for(i=1;i<=n;i++)
        {
        	for(j=1;j<=i;j++)
        	{    
        		if((i>=4) && (j>=4) || (i>4))
        		{
        			System.out.print(k+" ");
        			k++;
        		}
        		
        		else
        			{
        			System.out.print(p+" ");
        			p++;
        			}
        	
        }
	     System.out.println();
        }
	}

}
