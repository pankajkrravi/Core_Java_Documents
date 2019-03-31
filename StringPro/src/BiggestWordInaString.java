
public class BiggestWordInaString {

	public static void main(String[] args) {
		String st="Ranapratap is a good boy";
		char ch[]=st.toCharArray();
		String big="";
		for(int i=0;i<=ch.length;i++)
		{
			String w="";
			while(i<ch.length&&ch[i]!=' '){
				w=w+ch[i];
				i++;
			}
			if(big.length()<w.length()){

				big=w;
			}
			
		}
		System.out.println(" biggest word is   :"+big);
		System.out.println("length of word is :"+big.length());
	}
}

