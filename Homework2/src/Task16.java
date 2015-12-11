import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, number2;
		do {
			number = sc.nextInt();
			number2 = sc.nextInt();
		} while (number < 9 || number2 < 9 || number > 5555 || number2 > 5555);
		sc.close();
		for (int i = number2; i >= number; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
