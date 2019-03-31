import java.util.Scanner;

public class Weds {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num b/w 1to 100");
		int n=sc.nextInt();
		int pr=printRelation();

	} static void  printRelation(int n) {
		if(n>0 && n<=100){
			if(n%3==0)
				System.out.println("Sanju");
			else if(n%5==0)
				System.out.println("Githa");
			else if (n%15==0)
				System.out.println("Sanju weds Githa");
		}
		else
			System.out.println("no relation");
	} 

}

