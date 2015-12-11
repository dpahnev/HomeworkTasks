import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] arr = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int sredno;
		if (sum % 7 < 4) {
			sredno = sum / size;
		} else {
			sredno = sum / size + 1;
		}
		int naiBlizko = 0;
		int razlika = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {

			if (razlika > Math.abs(arr[i] - sredno)) {
				naiBlizko = arr[i];
				razlika = Math.abs(arr[i] - sredno);

			}
		}
		System.out.println(naiBlizko);

	}
}
