import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int first, second, third, forth;
		do {
			first = sc.nextInt();
			second = sc.nextInt();
			third = sc.nextInt();
			forth = sc.nextInt();
		} while (!(first > 0 && second > 0 && third > 0 && forth > 0 && first < 9 && second < 9 && third < 9
				&& forth < 9));
		sc.close();
		if (((first + second) % 2 == 0) != ((third + forth) % 2 == 0)) {
			System.out.println("poziciite sa s razlichen cvqt");
		} else {
			System.out.println("pozicite sa s ednakuv cvqt");
		}

	}

}
