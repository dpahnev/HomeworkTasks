import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] newArr = new int[size];
		if (size % 2 == 1)
			for (int i = 0; i <= size / 2; i++) {
				newArr[i] = arr[i];
				newArr[size / 2 + i] = arr[size / 2 - i];
			}
		else {
			for (int i = 0; i < size / 2; i++) {
				newArr[i] = arr[i];
				newArr[size / 2 + i] = arr[size / 2 - i - 1];
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(newArr[i]);
		}
	}
}
