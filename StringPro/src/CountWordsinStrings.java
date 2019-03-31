
public class CountWordsinStrings {
	public static void main(String[] args) {
		String st="Rama is a good boy";
		char ch[]=st.toCharArray();
		for(int i=0;i<=ch.length;i++)
		{
			int count=0;String w="";
			while(i<ch.length&&ch[i]!=' '){
				w=w+ch[i];
				i++;
				count++;
			}
			if(count>0){
				System.out.println(w+"--->: "+count);
			}
		}
	}
}
