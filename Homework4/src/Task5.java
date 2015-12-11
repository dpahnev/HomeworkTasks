
public class Task5 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int sumRow = 0;
		int sumCol = 0;
		int br = 0;
		int maxSumRow = 0;
		int maxSumCol = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == br) {
					sumRow += arr[i][j];
					sumCol += arr[j][i];
				}
			}
			br++;
			if (maxSumRow < sumRow) {
				maxSumRow = sumRow;
			}
			if (maxSumCol < sumCol) {
				maxSumCol = sumCol;
			}
			sumCol = 0;
			sumRow = 0;

		}
		System.out.println("nai golqma suma po redove e " + maxSumRow);
		System.out.println("nai golqma suma po koloni e " + maxSumCol);
		if (maxSumCol > maxSumRow) {
			System.out.println("Nai golqmata suma po redove e < ot nai golqmata suma po koloni");
		}
		if (maxSumRow > maxSumCol) {
			System.out.println("Nai golqmata suma po redove e > ot nai golqmata suma po koloni");
		}
		if (maxSumCol == maxSumRow) {
			System.out.println("Nai golqmata suma po redove e = ot nai golqmata suma po koloni");

		}
	}
}
