import java.util.Scanner;

public class Task5 {
	public static void pringSpace(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		boolean flag = false;
		int index1 = 0, index2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				if (str1.charAt(j) == str2.charAt(i)) {
					flag = true;
					index2 = i;
					index1 = j;
					break;
				}
			}
			if (flag)
				break;
		}
		if (flag) {
			for (int i = 0; i < str1.length(); i++) {
				if (i == index1) {
					System.out.println(str2);
				} else {
					pringSpace(index2);
					System.out.println(str1.charAt(i));
				}
			}
		} else {
			System.out.println("nqmat obshti bukvi");
		}

	}
}
