import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LocalOffice extends Office {

	private Queue<Protocol> pratkiForClient = new LinkedBlockingQueue<>();
	private Queue<Protocol> pratkiForCentral = new LinkedBlockingQueue<>();
	static int i = 0;

	public LocalOffice(String city) {
		super(city);
		// TODO Auto-generated constructor stub
	}

	public void add(Protocol currentPratka) {
		addPratkaToRegistry(currentPratka.getPratka());
		String receiverCity = currentPratka.getPratka().getReceiver().getCurrentOffice().getCity();
		String senderCity = currentPratka.getPratka().getSender().getCurrentOffice().getCity();
		if (receiverCity.equals(senderCity)) {
			addForClient(currentPratka);
		} else {
			addForCentral(currentPratka);
		}
	}

	public void addForCentral(Protocol pratkaSusProtocol) {
		synchronized (pratkiForCentral) {
			pratkiForCentral.add(pratkaSusProtocol);
			pratkiForCentral.notifyAll();
		}
	}

	public void addForClient(Protocol pratkaSusProtocol) {
		synchronized (pratkiForClient) {
			// System.out.println(i++);

			pratkiForClient.add(pratkaSusProtocol);
			pratkiForClient.notifyAll();
		}
	}

	public boolean isEmpty() {
		return pratkiForCentral.isEmpty();
	}

	public Protocol getForCentral() throws InterruptedException {
		while (pratkiForCentral.isEmpty()) {
			synchronized (pratkiForCentral) {

				pratkiForCentral.wait();
				// System.out.println("subudihme se za Centrala");

			}
		}
		synchronized (pratkiForCentral) {
			// System.out.println("zehme pratka");
			return pratkiForCentral.poll();
		}
	}

	public Protocol getForClient() throws InterruptedException {
		while (pratkiForClient.isEmpty()) {
			synchronized (pratkiForClient) {

				pratkiForClient.wait();
				// System.out.println("subudihme se za Centrala");

			}
		}
		synchronized (pratkiForClient) {
			return pratkiForClient.poll();
		}
	}

}
