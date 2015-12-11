import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		boolean isTrue = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isTrue = false;
				break;
			}
		}
		if (isTrue) {
			System.out.println("da");
		} else {
			System.out.println("ne");
		}
	}
}
