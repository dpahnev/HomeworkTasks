import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int[] arr = new int[N];
		for (int i = 1; i <= N; i++) {
			arr[i - 1] = i;

		}
		System.out.println(Arrays.toString(arr));
	}
}