import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter five numbers");
		for (int i = 1; i <= 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println(arr[i]);
		}
	}
}
