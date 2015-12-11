import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		do {
			number = sc.nextInt();
		} while (number < 1 || number > 999);
		sc.close();
		int br = 1;
		while (br <= 10) {
			number++;
			if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
				System.out.print(br + ":" + number + " ");
				br++;
			}
		}
	}
}
