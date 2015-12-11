import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		sc.close();
		int br = 1;
		do {

			sum += br;
			br++;
		} while (br <= number);
		System.out.println("sumata e " + sum);

	}
}
