import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first;
		int second;
		do {
			first = sc.nextInt();
			second = sc.nextInt();

		} while (!(first >= 10 && second >= 10 && first < 100 && second < 100));
		sc.close();
		int multiplied = first * second;
		if (multiplied % 2 == 0) {
			System.out.println(multiplied + " " + multiplied % 10 + " " + "chetno e");
		} else {
			System.out.println(multiplied + " " + multiplied % 10 + " " + "nechetno e");
		}

	}
}
