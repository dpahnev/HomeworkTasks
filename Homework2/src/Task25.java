import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		sc.close();
		long sum = 1;
		do {
			sum *= number;
			number--;
		} while (number > 1);
		System.out.println(sum);
	}
}
