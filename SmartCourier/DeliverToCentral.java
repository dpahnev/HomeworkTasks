
public class DeliverToCentral extends Employee {

	public DeliverToCentral(String name, String eGN, String gSM, MainOffice office, LocalOffice department) {
		super(name, eGN, gSM, office, department);
	}

	@Override
	public void sendPratka(Protocol transferToCentral) {
		getMainOffice().add(transferToCentral);

	}

	@Override
	public void getPratka() throws InterruptedException {
		Protocol currentProtocol = getLocalOffice().getForCentral();
		currentProtocol.setReceiver(this);
		makeRegistry(currentProtocol);
		Protocol transferToCentral = new Protocol(currentProtocol.getPratka(), this);
		sendPratka(transferToCentral);
	}

}
