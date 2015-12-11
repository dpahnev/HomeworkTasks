import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		sc.close();
		for (int i = 1; i <= first; i++) {
			for (int j = first - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
