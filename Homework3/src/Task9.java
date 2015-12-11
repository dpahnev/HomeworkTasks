import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < size / 2; i++) {
			temp = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = temp;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
