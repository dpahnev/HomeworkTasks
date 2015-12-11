import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int br = 1;
		int stepenNaDve = 2;
		while (stepenNaDve <= n) {
			stepenNaDve *= 2;
			br++;
		}
		int[] arr = new int[br];
		for (int i = br - 1; i >= 0; i--) {
			arr[i] = n % 2;
			n = n >> 1;
		}
		for (int i = 0; i < br; i++) {
			System.out.print(arr[i]);
		}
	}

}
