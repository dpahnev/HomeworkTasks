import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
			number = sc.nextInt();
		} while (number < 10 || number > 30000);
		sc.close();
		int numberCoppy = number;
		int newNumber = 0;
		do {
			newNumber += numberCoppy % 10;
			numberCoppy /= 10;
			if (numberCoppy != 0) {
				newNumber *= 10;
			}

		} while (numberCoppy != 0);
		if (number == newNumber) {
			System.out.println("palindrom e");
		} else {
			System.out.println("ne e palindrom");
		}
	}
}
