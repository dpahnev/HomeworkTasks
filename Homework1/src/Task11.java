import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;

		do {
			input = sc.nextInt();
		} while ((input <= 99 || input > 999) || (input % 10 == 0 || (input / 10) % 10 == 0));
		sc.close();
		if ((input % (input / 100) == 0) && (input % (input % 10) == 0) && (input % (input / 10 % 10) == 0)) {
			System.out.println("chisloto se deli na cfrite si");
		} else {
			System.out.println("chisloto ne se deli na cifrite si");
		}
	}

}
