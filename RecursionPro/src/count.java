import java.util.Scanner;
//counting 5
public class count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		count5(num);
		System.out.println("counting5 in "+num+"is: "+count5(num));
	}

	private static int count5(int num) {
		if(num<=9){
			if(num==5){
			return 1;
		}else{
			return 0;
		}
		}
		else{
			if(num%10==5){
				return 1+count5(num/10);
			}else{
				return 0+count5(num/10);
			}
		}
	}
}