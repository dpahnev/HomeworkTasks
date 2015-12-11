import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		int plus, minus, miltiply, division;
		plus = first + second;
		minus = first - second;
		miltiply = first * second;
		division = first / second;
		System.out.println("A+B=" + plus);
		System.out.println("A-B=" + minus);
		System.out.println("A*B=" + miltiply);
		System.out.println("A/B=" + division);

	}

}
