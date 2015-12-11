import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		if (first > second) {
			int temp = first;
			first = second;
			second = temp;
		}
		for (int i = first; i <= second; i++) {
			System.out.print(i + " ");
		}
	}

}
