import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		do {
			str1 = sc.nextLine();
			str2 = sc.nextLine();

		} while (str1.length() > 40 || str2.length() > 40);
		sc.close();
		System.out.print(str1.toUpperCase() + " " + str1.toLowerCase() + " ");
		System.out.print(str2.toUpperCase() + " " + str2.toLowerCase());

	}
}
