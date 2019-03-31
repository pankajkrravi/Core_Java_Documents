import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String st=sc.next();
		for(int i=st.length();i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
