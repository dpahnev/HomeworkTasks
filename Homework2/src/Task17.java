import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
			number = sc.nextInt();
		} while (number < 5 || number > 20);
		char letter = sc.next().charAt(0);
		sc.close();
		for (int i = 0; i <= number; i++) {
			for (int j = number - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 2 * i - 1; j > 0; j--) {
				if (i != number) {
					System.out.print(letter);
				} else
					System.out.print("*");
			}
			if (i != 0) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
