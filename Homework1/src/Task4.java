import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		if (first <= second) {
			System.out.println(first + " " + second);
		} else {
			System.out.println(second + " " + first);
		}
	}

}
