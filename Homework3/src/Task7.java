import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = new int[size];
		for (int i = 0; i < size; i++) {
			if (i == 0 || i == size - 1) {
				arr2[i] = arr[i];
			} else {
				arr2[i] = arr[i - 1] + arr[i + 1];
			}
			System.out.print(arr2[i] + " ");
		}
	}
}
