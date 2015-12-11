import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		do {
			hour = sc.nextInt();
		} while (hour > 24 || hour < 0);
		sc.close();
		if (hour > 17 || hour < 5) {
			System.out.println("Dobur vecher");
		}
		if (hour > 4 && hour < 10) {
			System.out.println("dobro ytro");
		}
		if (hour > 9 && hour < 18) {
			System.out.println("dobur den");
		}

	}

}
