import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			input = sc.nextInt();
		} while (input > 999 || input < 100);
		sc.close();
		int A, B, C;
		C = input % 10;
		B = (input / 10) % 10;
		A = input / 100;
		if (A == B && B == C) {
			System.out.println("Cifrite sa ednakvi");
		} else if (A > B && B > C) {
			System.out.println("cifrite sa vuv nizhodqsh red");
		} else if (A < B && B < C) {
			System.out.println("Cifrite sa vuv vyzhodqsht red");
		} else {
			System.out.println("Cifrite sa nepodredeni");
		}
	}

}
