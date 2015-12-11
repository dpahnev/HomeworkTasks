import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < cols; i++) {
			for (int j = rows - 1; j >= 0; j--) {
				System.out.print(arr[j][i] + " ");

			}
			System.out.println();
		}
	}

}
