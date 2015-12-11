import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		sc.close();
		boolean isSumple = true;
		for (int i = 2; i <= Math.sqrt(first); i++) {
			if (first % i == 0) {
				isSumple = false;
			}
		}
		if (isSumple) {
			System.out.println("Simple number");
		} else {
			System.out.println("complex number");
		}
	}

}
