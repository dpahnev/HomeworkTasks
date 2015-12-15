package Task2;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegeree;
	double money;

	Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegeree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	public void upYear() {
		if (!isDegeree) {
			this.yearInCollege++;
			if (yearInCollege == 4) {
				isDegeree = true;
				return;
			}
			return;
		}
		System.out.println("Vie ste diplomiran student");
	}

	public double receiveSchoolarship(double min, double amount) {
		if (grade >= min && this.age < 30) {
			money += amount;
			return money;
		}
		return money;

	}

}
