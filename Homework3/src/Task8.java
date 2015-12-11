import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int br = 0;
		int maxBr = 0;
		int index = 0;
		for (int i = 1; i < size; i++) {
			if (arr[i - 1] == arr[i]) {
				br++;
			} else {
				br = 0;
			}
			if (maxBr < br) {
				maxBr = br;
				index = i - br;
			}
		}

		for (int i = index; i <= index + maxBr; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
