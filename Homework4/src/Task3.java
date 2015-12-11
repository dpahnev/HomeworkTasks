import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		int sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
		}
		sc.close();
		System.out.println("sumata e=" + sum);
		System.out.println("sredno aritmetichno e=" + ((double) sum / (rows * cols)));
	}
}
