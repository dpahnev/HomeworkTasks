import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		sc.close();
		int sum = 0;
		if (first >= 0) {
			for (int i = 0; i <= first; i++) {
				sum += i;
			}
			System.out.print("sumata e = " + sum);
		} else {
			for (int i = 0; i >= first; i--) {
				sum += i;
			}
			System.out.print("sumata e = " + sum);
		}
	}

}
