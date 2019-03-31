import java.util.Scanner;

public class PrimeBtwn {

	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int nm = sc.nextInt();
		displayPrime(nm);
	}
	static void displayPrime(int nm) {
		int val=0;int count =1;
		for(int i=1;i<=nm;i++){
			val=getPrime(i);
			System.out.println("Prime num is b/w 1 to " +nm+" is:" +count );
			if(val==2)count++;
		}
	}

	static int getPrime(int i) {
		int count =1;
		for(int j=1;j<=(i/2);j++){
			if(i%j==0);
		}
		return count;

	}

}
