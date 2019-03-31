import java.util.Scanner;

public class ConvertFistLetterInCap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentanse: ");
		String str=sc.nextLine();
		String s=initCap(str);
		System.out.println(s);
	}
	private static String initCap(String st) {
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else{
				if(ch[i]>=65&&ch[i]<=90)
					ch[i]=(char)(ch[i]+32);
			}
		}
		/*character Array into String
		st=" ";
		for(int i=0;i<ch.length;i++)
		{
			st=st+ch[i];*/
		//char array to string
		st=new String(ch);
		return st;
	}
}
