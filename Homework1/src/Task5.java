import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		sc.close();
		int temp;
		if (first >= second && second >= third) {
			System.out.println(first + " " + second + " " + third);
		} else if (first < second && first > third) {
			temp = first;
			first = second;
			second = temp;
		} else if (first < second && second < third) {
			System.out.println(third + " " + second + " " + first);
		} else
			System.out.println(third + " " + first + " " + second);
	}

}
