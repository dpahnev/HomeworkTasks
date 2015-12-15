package Task2;

public class College {
	public static void main(String[] args) {
		Student miro = new Student();
		Student asen = new Student("asen", "geografiq", 15);
		Student marko = new Student("marko", "matematika", 20);
		miro.name = "asen";
		miro.upYear();
		marko.grade = 5.25;
		marko.receiveSchoolarship(4.50, 500.25);
		marko.upYear();
		asen.grade = 3.50;
		Student martin = new Student("martin", "matematika", 20);
		Student todor = new Student("todor", "matematika", 23);
		Student petar = new Student("petar", "matematika", 22);
		Student stoqn = new Student("stoqn", "matematika", 21);

		StudentGroup matematika = new StudentGroup();
		matematika.groupSubject = "matematika";
		matematika.addStudent(stoqn);
		matematika.addStudent(miro);
		matematika.addStudent(marko);
		matematika.addStudent(todor);
		matematika.addStudent(petar);
		matematika.addStudent(asen);
		matematika.addStudent(martin);
		matematika.printStudentsInformation();

		System.out.println(matematika.bestStudent());
		matematika.emptyGroup();
		matematika.printStudentsInformation();

		StudentGroup geografiq = new StudentGroup("geografiq");
		geografiq.printStudentsInformation();
		geografiq.addStudent(asen);
		geografiq.printStudentsInformation();
	}
}
