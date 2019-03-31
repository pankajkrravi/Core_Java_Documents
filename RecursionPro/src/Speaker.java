import java.util.Scanner;
//miobile speaker 
public class Speaker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int mob=sc.nextInt();
		mobileSpeaker(mob);
		System.out.println("mobile speaker "+mobileSpeaker( mob));
	}

	private static int mobileSpeaker(int mob) {
		if(mob==0){
			return 0;
		}else{
			if(mob%2==0){
				return 2+mobileSpeaker(mob-1);
			}
			else{
				return 1+mobileSpeaker(mob-1);
			}
		}
	}

}
