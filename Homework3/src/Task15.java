import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double[] arr = new double[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextDouble();
		}
		double br = 0;
		boolean flag = true;
		for (int i = 0; i < size; i++) {
			int tempBr = 0;
			if (br == 3)
				break;
			flag = true;
			for (int j = 0; j < size; j++) {
				if (j == i)
					continue;
				if (Math.abs(arr[i]) <= Math.abs(arr[j])) {
					tempBr++;
					if (tempBr >= 3) {
						flag = false;
						break;
					}
				}
			}
			if (flag && tempBr < 3) {
				System.out.println(arr[i]);
				br++;
			}

		}

	}

}
