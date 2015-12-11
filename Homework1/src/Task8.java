import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("input number between 1000 and 9999");
		do {
			number = sc.nextInt();

		} while (!(number >= 1000 && number <= 9999));
		sc.close();
		int first = number % 10 + (number / 1000) * 10;
		int second = ((number / 100) % 10) * 10 + (number / 10) % 10;

		if (first > second) {
			System.out.println("po golqmo(" + first + ">" + second + ")");
		} else if (first == second) {
			System.out.println("ravni(" + first + "=" + second + ")");
		} else {
			System.out.println("po malko(" + first + "<" + second + ")");
		}
	}

}
