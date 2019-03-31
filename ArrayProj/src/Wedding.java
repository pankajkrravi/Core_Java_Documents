import java.util.Scanner;
import java.io.*;
public class Wedding {
	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Random no b/w 1 to 100");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.println("Sanju weds Geetha " + i);
			if(i%3==0 && i%5!=0 )
				System.out.println("Sanju " +i);
			if(i%5==0 && i%3!=0)
			
				System.out.println("Geetha " +i);
		}

		sc.close();
	}

}
