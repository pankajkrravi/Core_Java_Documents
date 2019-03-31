import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int k=0;
		for(int i=0;i<=st.length();i++){
			for(int j=1;j<=i;j++){
				if(k==st.length());

				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}


