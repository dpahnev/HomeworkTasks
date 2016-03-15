
public class DeliverToClient extends Employee {

	public DeliverToClient(String name, String eGN, String gSM, MainOffice office, LocalOffice department) {
		super(name, eGN, gSM, office, department);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendPratka(Protocol transferToClient) {
		Protocol deliveryProtocol = new Protocol(transferToClient.getPratka(), this);
		deliveryProtocol.setReceiver(transferToClient.getPratka().getReceiver());
		transferToClient.getPratka().deliver();
		makeRegistry(transferToClient);
	}

	@Override
	public void getPratka() throws InterruptedException {
		Protocol currentProtocol = getLocalOffice().getForClient();
		currentProtocol.setReceiver(this);
		makeRegistry(currentProtocol);
		Protocol transferToClient = new Protocol(currentProtocol.getPratka(), this);
		sendPratka(transferToClient);
	}
}
