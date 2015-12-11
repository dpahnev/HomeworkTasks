import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int degrees;
		do {
			degrees = sc.nextInt();
		} while (degrees < -100 || degrees > 100);
		sc.close();
		if (degrees < -20) {
			System.out.println("ledeno studeno");
		} else if (degrees < 1) {
			System.out.println(" studeno");
		} else if (degrees < 16) {
			System.out.println("hladno");
		} else if (degrees < 26) {
			System.out.println("toplo");
		} else {
			System.out.println("goreshto");
		}

	}

}
