package Task2;

public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;

	public StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		groupSubject = subject;
	}

	public void addStudent(Student ivan) {
		if (freePlaces > 0 && ivan.subject != null && ivan.subject.equals(groupSubject)) {
			students[students.length - freePlaces--] = ivan;
		}
	}

	public void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	public String bestStudent() {
		if (freePlaces == 5) {
			System.out.println("Nqma studenti v grupata");
			return new String("");
		}
		Student bestStudent = students[0];
		for (int i = 1; i < students.length - freePlaces; i++) {
			if (bestStudent.grade < students[i].grade) {
				bestStudent = students[i];
			}
		}
		return bestStudent.name;
	}

	public void printStudentsInformation() {
		if (freePlaces == 5) {
			System.out.println("Nqma Studenti v grupata//grupata e prazna");
		}
		for (int i = 0; i < students.length - freePlaces; i++) {
			System.out.println(students[i].name + " na " + students[i].age + " godini " + students[i].yearInCollege
					+ " godina v " + students[i].subject + " s uspeh " + students[i].grade + ". Ima "
					+ students[i].money + " ot stipendiq");

		}
	}

}
