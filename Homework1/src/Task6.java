import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		sc.close();
		int temp;
		temp = first;
		first = second;
		second = third;
		third = temp;
		System.out.println(first + " " + second + " " + third);

	}

}
