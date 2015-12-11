import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		sc.close();
		for (int i = 3; i < first; i += 3) {
			System.out.print(i + " ");
		}
	}

}
