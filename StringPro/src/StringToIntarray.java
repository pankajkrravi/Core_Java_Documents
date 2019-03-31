import java.util.Scanner;

public class StringToIntarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int [] ar=stringTochar(st);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

	private static int[] stringTochar(String st) {
		char []ch=st.toCharArray();
   while(ch[i]!=' '&&ch[i]==','&&ch[i]==2&&ch[i])
	}

}
