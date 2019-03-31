import java.util.Scanner;

public class NumberDivByThree {

	public static void main(String[] args) {
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the num to count div by 3 \n");
		int number =sc.nextInt();
		for(i=1;i<=number;i++)
		{
			if(i%3==0)
			
				count++;
			
		}
		System.out.println("the no of divisors of three between the range of 1 to"+ number+ " is: "+count);
		
	}

}
