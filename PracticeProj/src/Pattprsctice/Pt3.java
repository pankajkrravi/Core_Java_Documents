package Pattprsctice;

import java.util.Scanner;

public class Pt3 {

	public static void main(String[] args) {

		System.out.println("Enter the no of lines");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
		}
	}
}
