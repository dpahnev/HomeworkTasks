
public class Task7 {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sumAll = 0;
		int sum = 0;
		for (int i = 0; i < arr.length * arr[0].length; i++) {
			int index1 = i / arr.length;
			int index2 = i % arr[0].length;
			if ((index1 + index2) % 2 == 0) {
				System.out.print(arr[index1][index2] + " ");
				sum += arr[index1][index2];
			}
			if (index2 == arr[0].length - 1) {
				System.out.print("sumata na reda e " + sum);
				sumAll += sum;
				sum = 0;
				System.out.println();
			}
		}
		System.out.println("cqlata suma e " + sumAll);
	}
}
