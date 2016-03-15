public class DeliverToCity extends Employee {

	public DeliverToCity(String name, String eGN, String gSM, MainOffice office, LocalOffice department) {
		super(name, eGN, gSM, office, department);
	}

	@Override
	public void sendPratka(Protocol transferToCity) {
		getLocalOffice().addForClient(transferToCity);
	}

	@Override
	public void getPratka() throws SmartCourierException {

		// System.out.println(getLocalOffice().getCity());
		Protocol currentProtocol = getMainOffice().getByCity(getLocalOffice().getCity());
		currentProtocol.setReceiver(this);
		makeRegistry(currentProtocol);
		Protocol transferToCity = new Protocol(currentProtocol.getPratka(), this);
		sendPratka(transferToCity);
	}

}
