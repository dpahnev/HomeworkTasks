import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedi chislo A");
		double firstNumber = sc.nextDouble();
		System.out.println("Vuvedi chislo B");
		double secondNumber = sc.nextDouble();
		System.out.println("Vuvedi chislo C");
		double thirdNumber = sc.nextDouble();
		sc.close();
		if (firstNumber < secondNumber && secondNumber < thirdNumber) {
			System.out.println("chisloto C e mejdu A i B");
		} else {
			System.out.println("chisloto C ne e mejdu A i B");
		}
	}

}
