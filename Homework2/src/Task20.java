
public class Task20 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int firstNum;
			firstNum = i + 1;
			for (int j = 0; j < 10; j++) {
				if (firstNum == 10) {
					firstNum = 0;
				}
				System.out.print(firstNum);
				firstNum++;
			}
			System.out.println();
		}
	}

}
