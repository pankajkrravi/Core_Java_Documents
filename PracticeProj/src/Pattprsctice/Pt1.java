package Pattprsctice;
import java.util.Scanner;
/*
1*****
12****
123***
1234**
12345*
123456
 */
public class Pt1 {
	public static void main(String[] args) {
		System.out.println("Enter the no of lines");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int k=n;k>i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



