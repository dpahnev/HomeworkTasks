import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10];
		int br = n * 2;
		arr[0] = n;
		arr[1] = n;
		for (int i = 2; i < 10; i++) {
			arr[i] = br;
			br = arr[i - 1] + arr[i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
