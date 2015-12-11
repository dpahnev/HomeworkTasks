import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			if (arr[i] < min && arr[i] % 3 == 0) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
