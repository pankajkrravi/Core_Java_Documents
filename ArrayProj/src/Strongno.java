import java.util.Scanner;

public class Strongno {
	public static void main(String args[])
	{
		int f=1,s=0,t,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the no to be checked");
		int num=sc.nextInt();
		t=num;
		while(t>0)
		{
			p=t%10;
			f=1;
			while(p>0)
			{
				f=f*p;
				p--;
			}
			s=s+f;
			t=t/10;
		}
		if(s==num)
			System.out.println("strong no "+num);
		else
			System.out.println("Not a strong no"+num);
		
		
	}

}
