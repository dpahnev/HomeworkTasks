import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vuvedi A i B");
		int first = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		int temp;
		temp = first;
		first = second;
		second = temp;
		System.out.println("A=" + first + " B=" + second);

	}

}
