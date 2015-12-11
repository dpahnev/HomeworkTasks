import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("vuvedi size i elementi na pruviq masiv");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("vuvedi size i elementi na vtoriq masiv");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		if (size != size2) {
			System.out.println("s razlichna duljina sa");
		} else {
			boolean flag = true;
			for (int i = 0; i < size; i++) {
				if (arr[i] != arr2[i]) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("ednakvi sa");
			} else {
				System.out.println("ne sa ednakvi");
			}

		}
	}
}
