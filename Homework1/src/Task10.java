import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int bucket1 = 0;
		int bucket2 = 0;
		int water;
		Scanner sc = new Scanner(System.in);
		water = sc.nextInt();
		sc.close();
		while (water > 0) {
			if (water > 6) {
				bucket1++;
				bucket2++;
				water -= 5;
			} else if (water == 6) {
				bucket2 += 2;
				water = 0;
			} else if (water == 5) {
				bucket1++;
				bucket2++;
				water = 0;
			} else if (water == 4) {
				bucket1 += 2;
				water = 0;
			} else if (water == 3) {
				bucket2++;
				water = 0;
			} else if (water == 2) {
				bucket1++;
				water = 0;
			}

		}
		System.out.println(bucket1 + " kofi ot 2 litra" + "\n" + bucket2 + " kofi ot 3 litra");
	}

}
