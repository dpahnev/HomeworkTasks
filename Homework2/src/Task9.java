import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		if (first > second) {
			int temp = first;
			first = second;
			second = temp;
		}
		int sum = 0;
		for (int i = first; i <= second; i++) {
			if (i % 3 == 0) {
				System.out.print(" skip" + i * i + " ");
				continue;
			}
			System.out.print(i * i + " ");
			sum += i * i;
			if (sum > 200) {
				break;
			}

		}

	}

}
