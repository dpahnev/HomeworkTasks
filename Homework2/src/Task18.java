import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, number2;
		do {
			number = sc.nextInt();
			number2 = sc.nextInt();

		} while (number < 1 || number > 9 || number2 < 1 || number2 > 9);
		sc.close();
		for (int i = 1, j = 1; j <= number2; i++) {
			if (number == 1) {
				i = 1;
			}
			System.out.println(i + "*" + j + "=" + (i * j));

			if (i == number) {
				j++;
				i = 1;
			} else if (i > number) {
				j++;
				i = 0;
			}

		}
	}
}
