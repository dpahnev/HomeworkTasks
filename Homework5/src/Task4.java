import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		int index = input.indexOf(',');
		String firstPerson = input.substring(0, index).trim();
		String secondPerson = input.substring(index + 1).trim();
		int firstSum = 0;
		for (int i = 0; i < index; i++) {
			firstSum += (int) firstPerson.charAt(i);
		}
		int secondSum = 0;
		for (int i = 0; i < secondPerson.length(); i++) {
			secondSum += (int) secondPerson.charAt(i);
		}
		System.out.println("|||" + firstSum + "|||" + secondSum);
		if (firstSum > secondSum) {
			System.out.println(firstPerson);
		}
		if (firstSum < secondSum) {
			System.out.println(secondPerson);
		}
		if (firstSum == secondSum) {
			System.out.println("s ravna suma na ASCII codove sa \n");
			System.out.println(firstPerson);
			System.out.println(secondPerson);
		}

	}
}
