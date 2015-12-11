import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		int sum = 0;
		int number = 0;
		boolean minus = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '-') {
				minus = true;
				continue;
			}
			if (str.charAt(i) - '0' < 0 || str.charAt(i) - '0' > 9) {
				continue;
			} else {
				number += str.charAt(i) - '0';
				number *= 10;
				if (((i < str.length() - 1) && (str.charAt(i + 1) - '0' < 0 || str.charAt(i + 1) - '0' > 9))
						|| (i == str.length() - 1)) {
					if (minus) {
						number *= -1;
						minus = false;
					}
					number /= 10;
					sum += number;
					System.out.println(number);
					number = 0;
				}
			}
		}
		System.out.println("suma=" + sum);

	}
}
