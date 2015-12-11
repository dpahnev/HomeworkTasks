
public class Task16 {

	public static void main(String[] args) {
		double[] arr = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		int size = arr.length;
		for (int i = 1; i <= size; i++) {
			System.out.print(arr[i - 1] + " ");
		}
		System.out.println();
		for (int i = 1; i <= size; i++) {
			if (arr[i - 1] < -0.231) {
				arr[i - 1] = 41.25 + i * i;
			} else {
				arr[i - 1] *= i;
			}
			System.out.print(arr[i - 1] + " ");
		}

	}

}
