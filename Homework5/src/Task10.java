import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		char[] newChar = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			newChar[i] = str.charAt(i);
			newChar[i] += 5;
		}
		str = new String(newChar);
		System.out.println(str);
	}
}
