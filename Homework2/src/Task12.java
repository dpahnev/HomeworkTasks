
public class Task12 {

	public static void main(String[] args) {
		int first, second, third;
		for (int i = 100; i < 1000; i++) {
			first = i % 10;
			second = i / 10 % 10;
			third = i / 100;
			if (first == second || first == third || second == third) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
