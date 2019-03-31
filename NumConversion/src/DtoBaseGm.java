import java.util.Scanner;
public class DtoBaseGm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int dec=sc.nextInt();
		System.out.println("enter base");
		int base=sc.nextInt();
		String oct=decToBase(dec,base);
		System.out.println(dec+"and "+base+"in is ==>"+oct);
	}
	static String decToBase(int dec,int base) {
		String con="";
		while(dec!=0){
			int r=dec%base;
			if(r<10)
				con=r+con;
			else
				con=(char)(r+55)+con;
			dec=dec/base;
		}
		return con;
	}
}


