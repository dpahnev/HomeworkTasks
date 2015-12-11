
public class Task5 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 1; i <= 10; i++) {
			arr[i - 1] = i * 3;
			System.out.println(arr[i - 1]);
		}
	}
}
