import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine().trim();
		sc.close();
		int brWords = 1;
		int wordLenght = 0;
		int longestWord = 0;
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i) == ' ') {
				brWords++;
				if (longestWord < wordLenght) {
					longestWord = wordLenght;
				}
				wordLenght = 0;
			} else {
				wordLenght++;
			}

		}
		if (brWords == 1) {
			System.out.println(brWords + " dumi  nai-Dulgata duma e s " + wordLenght + " simvola");

		} else {
			System.out.println(brWords + " dumi  nai-Dulgata duma e s " + longestWord + " simvola");
		}

	}
}
