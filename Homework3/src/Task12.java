import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < size; i++) {
			if (i == 1) {
				temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
			if (i == 3) {
				arr[3] += arr[2];
				arr[2] = arr[3] - arr[2];
				arr[3] = arr[3] - arr[2];

			}
			if (i == 5) {
				arr[5] *= arr[4];
				arr[4] = arr[5] / arr[4];
				arr[5] /= arr[4];
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
