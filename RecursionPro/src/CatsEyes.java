import java.util.Scanner;

public class CatsEyes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of cat  :");
		int cats=sc.nextInt();
		System.out.println("no of cats eyes is:"+catEyes(cats));
		catEyes( cats);
	}

	private static int catEyes(int cats) {
		  if(cats ==0){
			  return 0;
		  }
		  else{
			 return 2+catEyes(cats -1); 
		  }
	}
}
