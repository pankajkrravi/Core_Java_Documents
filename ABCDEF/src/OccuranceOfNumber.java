import java.util.Scanner;
public class OccuranceOfNumber {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter five number");
		int arr[] = new int[5];
		for (int i = 1; i <= 5; i++) {
			arr[i] = sc.nextInt();
		}*/
		int arr[] = { 23, 45, 56, 23, 56, 78, 56, 12 };
		int n=arr.length;
		for (int i = 1; i <= n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i]==arr[j] ) {
					arr[j]=arr[n-1];
					n--;
					j++;
					count++;
				}
			}
			System.out.println(arr[i]+" occured"+ count);
		}
	}
}
