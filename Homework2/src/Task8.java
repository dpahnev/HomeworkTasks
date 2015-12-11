import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		sc.close();
		System.out.println("vuvedete n");
		int number = (first - 1);
		for (int i = 0; i < first; i++) {
			for (int j = 0; j < first; j++) {
				System.out.print(number);
			}
			System.out.println();
			number += 2;
		}
	}

}
