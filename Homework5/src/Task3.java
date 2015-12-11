import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		if (str1.length() == str2.length()) {
			System.out.println("s ednakva duljina sa");
		} else {
			System.out.println("ne sa s ednakva duljina");
		}
		int size = 0;
		if (str1.length() >= str2.length()) {
			size = str2.length();
		} else {
			size = str1.length();
		}
		System.out.println("razlika po pozicii: ");
		for (int i = 0; i < size; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				System.out.println(i + " " + str1.charAt(i) + "-" + str2.charAt(i));
			}
		}

	}
}
