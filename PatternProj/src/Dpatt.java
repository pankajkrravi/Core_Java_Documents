import java.util.Scanner;

public class Dpatt{

		public static void main(String[] args) {
			System.out.println("enter no ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int st=1;
			int sp=n/2;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=sp;j++){
					System.out.print(" ");
				}
				int  k=1;
				for(int j=1;j<=st;j++){
					System.out.print((char)(k+64));
					if(j<=st/2)
						k--;
					else
						k++;
				}
				if(i<=n/2){
					sp--;
					st=st+2;
				}
				else
				{
					sp++;
					st=st-2;
				}
				System.out.println();
			}
		}
	}
