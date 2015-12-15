package EmplyeeTaks;

public class Company {

	public static void main(String[] args) {
		Task burkaneNaBeton = new Task();
		System.out.println(burkaneNaBeton.getName() + " sus " + burkaneNaBeton.getWorkingHours() + " chasa");
		burkaneNaBeton.setName("Burkane na beton");
		burkaneNaBeton.setWorkingHours(22);
		System.out.println(burkaneNaBeton.getName() + " sus " + burkaneNaBeton.getWorkingHours() + " chasa");
		Task kopane = new Task("kopane", 15);
		System.out.println(kopane.getName() + " za vreme " + kopane.getWorkingHours());

		Employee ivan = new Employee("ivan");
		ivan.setHoursLeft(8);
		Employee petar = new Employee(null);
		Employee kiro = new Employee("");
		Employee dimitar = new Employee("dimitar");
		System.out.println(petar.currentTask.getName());
		System.out.println(kiro.getName());
		System.out.println(kiro.currentTask.getName());
		kiro.setName("kiro");
		petar.setName("petar");
		petar.setHoursLeft(4);
		kiro.setHoursLeft(6);
		dimitar.setHoursLeft(20);
		petar.setCurrentTask(burkaneNaBeton);
		dimitar.setCurrentTask(burkaneNaBeton);
		kiro.setCurrentTask(kopane);
		ivan.setCurrentTask(kopane);
		System.out.println(kopane.getWorkingHours());

		ivan.work();
		kiro.work();
		kiro.work();
		petar.work();
		dimitar.work();

	}

}
