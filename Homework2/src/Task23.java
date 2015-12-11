public class Task23 {
	public static void main(String[] args) {
		int first = 1, second = 1;
		while (first <= 9 && second <= 9) {
			System.out.print(first + "*" + second + " ");
			second++;
			if (second == 10) {
				first++;
				second = first;
				System.out.println();
			}

		}
	}
}
