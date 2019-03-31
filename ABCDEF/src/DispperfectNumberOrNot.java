import java.util.Scanner;

public class DispperfectNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Perfect num or not");
		int num=sc.nextInt();
		int pr=perfectNum(num);
		if(num==pr)
			System.out.println(+num+" is a perfect number ");
		else
			System.out.println(+num+" is not a perfect number ");
	}

	private static int perfectNum(int n) {
		int sum=0;
    for(int i=1;i<n;i++)
    {
    	if(n%i==0)
    		sum=sum+i;
    }
	return sum;
    	
	}
}
