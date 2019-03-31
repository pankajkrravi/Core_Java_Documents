import java.util.Scanner;

public class DispMin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two bumber to find min num");
		int x=s.nextInt();
		int y=s.nextInt();
		if(x>y)
			System.out.println(+y + " is minimun");
		else
			System.out.println(+x + "is minumum");
	}
}
