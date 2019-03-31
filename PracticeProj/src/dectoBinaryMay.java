import java.util.Scanner;

public class dectoBinaryMay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  decimal number");
		int num=sc.nextInt();
		String bin=dectobinary(num);
		System.out.println(num+" is in binary ="+bin);
	}

	private static String dectobinary(int num) {
		String bin=" ";
		while(num!=0)
		{
			int r=num%2;
			bin=r+bin;
			num=num/2;
		}
		return bin;
	
		
	}

}
