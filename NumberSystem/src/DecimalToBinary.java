import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		String bin=decTBin(num);
		System.out.println(+num+"is in binary system="+bin);
	}
	private static String decTBin(int num) {
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
