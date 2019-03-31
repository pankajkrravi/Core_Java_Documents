import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		for(int i=0;i<=st.length();i++){
			for(int j=i;j>=0;j--){
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
