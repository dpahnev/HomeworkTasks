import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int[] arr2 = new int[size];
		int[] arr3 = new int[size];
		int br = 0;
		int br2 = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					arr2[br] = arr[i][j];
					br++;
				}
				if (i + j == size - 1) {
					arr3[br2] = arr[i][j];
					br2++;
				}
			}
		}
		for (int i = 0; i < size; i++) {

			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
