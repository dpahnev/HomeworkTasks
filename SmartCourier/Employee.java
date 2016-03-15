
public abstract class Employee extends Person implements Runnable {

	private String name;
	private String EGN;
	private String GSM;
	private MainOffice mainOffice;
	private LocalOffice localOffice;

	public Employee(String name, String eGN, String gSM, MainOffice office, LocalOffice department) {
		super();
		this.name = name;
		EGN = eGN;
		GSM = gSM;
		this.mainOffice = office;
		this.localOffice = department;

	}

	@Override
	public void run() {
		while (true) {
			// try {
			// Thread.sleep(500);
			// } catch (InterruptedException e) {
			// e.printStackTrace();
			// }
			try {
				getPratka();
				// e.printStackTrace();
			} catch (InterruptedException e) {
				return; // e.printStackTrace();
			} catch (SmartCourierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void makeRegistry(Protocol toBeAddedInArchive) {
		localOffice.makeRegistry(toBeAddedInArchive);
	}

	public abstract void sendPratka(Protocol current);

	public abstract void getPratka() throws SmartCourierException, InterruptedException;

	public String getGSM() {
		return GSM;
	}

	public void setGSM(String gSM) {
		GSM = gSM;
	}

	public String getName() {
		return name;
	}

	public String getEGN() {
		return EGN;
	}

	public MainOffice getMainOffice() {
		return mainOffice;
	}

	public LocalOffice getLocalOffice() {
		return localOffice;
	}

}
