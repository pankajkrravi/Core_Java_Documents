import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no & base :");
		int num=sc.nextInt();
		int bb=sc.nextInt();
		System.out.println("no of "+power(num,bb));
		power(num ,bb);
	}

	private static int power(int num, int bb) {
		if(num ==1){
			return bb;
		}
		else{
			return bb*power(num-1,bb);
		}
	}

}
