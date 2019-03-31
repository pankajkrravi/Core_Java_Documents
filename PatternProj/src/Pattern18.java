import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		for(int i=1;i<=st.length();i++){
			for(int j=1;j<i;j++){
				System.out.print(st.charAt(i)+" ");
			}
			System.out.println();
		}
	}

}
