import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
			number = sc.nextInt();
		} while (number < 10 || number > 99);
		sc.close();
		while (number != 1) {
			if (number % 2 == 0) {
				number = number / 2;
			} else if (number % 2 == 1) {
				number = number * 3 + 1;
			}
			System.out.print(number + " ");
		}

	}
}
