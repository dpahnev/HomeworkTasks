import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
			number = sc.nextInt();
		} while (number < 10 || number > 200);
		sc.close();
		for (int i = number; i > 0; i--) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
