import java.util.Scanner;
public class Pattern7 {
	
		public static void main(String[] args) {
			System.out.println("enter no ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int st=1;
			int sp=n/2;
			int k=1,i,j,p=1,m=1;
			for( i=1;i<=n;i++){
				for( j=1;j<=sp;j++){
					System.out.print(" ");
				}
				for(j=1;j<=i;j++){
					if(i<=3){
						System.out.print(k);
						k++;
					}
					if(((i>=4)&&(j>=1))||((i==5)&&(j<=2)))
					{	System.out.print(p);
					p++;
					}
					else{
						System.out.print(m);
						m++;
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
}





