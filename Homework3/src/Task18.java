import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("vuvedi vtoriq masiv");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		int size3 = 0;
		if (size2 > size1) {
			size3 = size2;
		} else {
			size3 = size1;
		}
		int[] arr3 = new int[size3];
		for (int i = 0; i < size3; i++) {
			if (i >= size2) {
				arr3[i] = arr1[i];
			} else if (i >= size1) {
				arr3[i] = arr2[i];
			} else if (arr1[i] - arr2[i] >= 0) {

				arr3[i] = arr1[i];
			} else
				arr3[i] = arr2[i];
			System.out.print(arr3[i] + " ");

		}

	}
}
// 18 19 32 1 3 4 5 6 7 8
// 1 2 3 4 5 16 17 18 27 11
