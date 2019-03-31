import java.util.Scanner;

public class PallindromString {
	   String s1="MADAM";
	   boolean isPallindrom(String st){
		   String rev="";
		   for(int i=st.length()-1;i>=0;i--){
			   rev=rev+st.charAt(i);
		   }
		   return rev.equals(st);
	   }
	   public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   PallindromString p=new PallindromString();
		   p.isPallindrom("madam");
	}
}

