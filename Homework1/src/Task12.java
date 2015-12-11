import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		sc.close();
		boolean visokosna = false;
		if (year % 4 == 0) {
			visokosna = true;
			if (year % 100 == 0 && year % 400 != 0) {
				visokosna = false;
			}
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (day == 31) {
				day = 1;
				month++;
				break;

			}
		case 4:
		case 6:
		case 9:
		case 11:
			if (day == 31) {
				day++;
				month++;
				break;
			}
		case 2:
			if (visokosna) {
				if (day == 29) {
					day = 1;
					month++;
					break;
				}
			} else {
				if (day == 28) {
					day = 1;
					month++;
					break;
				}
			}

		case 12:
			if (day == 31) {
				day = 1;
				month = 1;
				year++;
				break;
			}
		default:
			day++;
			break;

		}
		System.out.println("den:" + day + " mesec:" + month + " godina:" + year);
	}

}
