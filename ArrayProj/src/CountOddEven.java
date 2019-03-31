import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to count"); 
		int x=sc.nextInt();
		int edc=0,odc=0;
		do{
			int r=x%10;
			if(r%2==0)
				edc++;
			else
				odc++;
			x=x/10;
		}
		while(x!=0);
		System.out.println("no of even digits:"+edc);
		System.out.println("no of odd digits "+odc);
	}


}
