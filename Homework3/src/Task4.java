import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		boolean flag = true;
		for (int i = 0; i < size / 2; i++) {
			if (arr[i] != arr[size - i - 1]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("ogledani sa");
		} else {
			System.out.println("ne sa ogledalni");
		}
	}
}
