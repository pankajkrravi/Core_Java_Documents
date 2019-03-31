import java.util.Scanner;
//print numbers
public class NumBetween {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num=sc.nextInt();
		printNumbers(num);
	}

	private static void printNumbers(int num) {
		if(num==0){
			return;
		}
		else{
			System.out.println(+num);
			printNumbers(num-1);
		}
	}


}
