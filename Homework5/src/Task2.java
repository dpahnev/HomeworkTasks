import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		do {
			str1 = sc.nextLine();
			str2 = sc.nextLine();
		} while ((str1.length() > 9 && str1.length() > 20) || (str2.length() > 9 && str2.length() > 20));
		sc.close();
		String firstString, secondString;
		firstString = str1.substring(0, 5).concat(str2.substring(5));
		secondString = str2.substring(0, 5).concat(str1.substring(5));
		if (firstString.length() < secondString.length()) {
			System.out.println(secondString.length() + " " + secondString);
		} else {
			System.out.println(firstString.length() + " " + firstString);
		}
	}
}
