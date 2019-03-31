import java.util.Scanner;

public class DecToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String bin=decToBinary(num);
		System.out.println(+num+ "in binary form="+bin);
	}
	private static String decToBinary(int num) {
		String bin="";
		while(num!=0)
		{
			int r=num%2;
			bin=r+bin;
			num=num/2;
		}
		return bin;
	}
}
