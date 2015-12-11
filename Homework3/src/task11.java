import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] arr = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int br = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				br++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print(br + " chisla");
	}

}
