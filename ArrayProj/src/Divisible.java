import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number between 1 to 100");
		int num=sc.nextInt();
		for(int i=0;i<=100;i++)
			if(i%3==0 && i%5==0)
				System.out.println("snju weds geetha");
			else if(i%3==0)
				System.out.println("sanju");
			else if(i%5==0)
				System.out.println("geetha");
	}

}


