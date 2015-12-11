import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		double money = sc.nextDouble();
		boolean health = sc.nextBoolean();
		sc.close();
		if (health == false) {
			System.out.println("i am sick and i will stay home");
			if (money > 0) {
				System.out.println("i have money and i will buy medicine");
			} else {
				System.out.println("i don`t have money and i will stay home and drink tea");
			}
		} else if (health == true && money < 10 && money > 0) {
			System.out.println("i will go to cinema with my friends");
		} else if (health == true && money < 10 && money > 0) {
			System.out.println("i will go to coffee");
		}

	}

}
