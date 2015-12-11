public class Task13 {
	public static int[] combine(int[] firstArr, int[] secondArr) {
		int size = firstArr.length + secondArr.length;
		int[] arr = new int[size];
		for (int i = 0, j = 0; i < size; i++) {
			if (i < secondArr.length) {
				arr[i] = firstArr[i];
			}
			if (i >= secondArr.length) {
				arr[i] = secondArr[j];
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

	}
}
