import java.util.Scanner;

public class Task14 {
	public static long fact(int N) {
		long rezult = 1;
		if (N == 0)

		{
			return 0;
		}

		for (int i = 1; i <= N; i++) {
			rezult *= i;
		}
		return rezult;

	}

	public static double factMinus(int N) {
		double rezult = 1;
		{
			for (int i = Math.abs(N); i > 0; i--) {
				rezult /= i;
			}
		}
		return rezult;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if (N >= 0) {
			System.out.println(fact(N));
		} else {
			System.out.println(factMinus(N));
		}
	}
}
