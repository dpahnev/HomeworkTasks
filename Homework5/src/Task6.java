import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine().trim();
		sc.close();
		sentance = sentance.toUpperCase().substring(0, 1).concat(sentance.substring(1));
		boolean flag = false;
		int lastIndex = 0;
		for (int i = 0; i < sentance.length(); i++) {
			if (flag) {
				sentance = sentance.substring(0, i).concat(sentance.toUpperCase().substring(i, i + 1))
						.concat(sentance.substring(i + 1));
			}
			flag = false;
			if (sentance.charAt(i) == ' ') {
				flag = true;
				lastIndex = i + 1;
			}
		}
		System.out.println(sentance);
	}
}
