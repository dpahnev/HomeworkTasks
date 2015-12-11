import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		do {
			sum = sc.nextInt();
		} while (sum < 1 || sum > 27);
		sc.close();
		int first, second, third;
		for (int i = 100; i < 1000; i++) {
			first = i % 10;
			second = i / 10 % 10;
			third = i / 100;
			if (first + second + third == sum) {
				System.out.print(i + " ");
			}

		}
	}

}
