import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1)
				continue;
			if (arr[i] < arr[i - 1] || arr[i] > arr[i + 1])
				;
			else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("izpulnqva iziskvaniqta");
		} else {
			System.out.println("ne izpulnqva iziskvaniqta");
		}

	}

}
