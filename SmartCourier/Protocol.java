
public class Protocol {
	private Pratka currentPratka;
	private Person receiver;
	private Person sender;

	public Protocol(Pratka currentPratka, Person sender) {
		this.currentPratka = currentPratka;
		this.sender = sender;
	}

	public Pratka getPratka() {
		return currentPratka;
	}

	public Person getOwner() {
		return sender;
	}

	public Person getReceiver() {
		return receiver;
	}

	public void setReceiver(Person receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		if (receiver != null) {
			return "Protocol [currentPratka=" + currentPratka + ", receiver=" + receiver + ", sender=" + sender + "]";
		} else {
			return "Protocol [currentPratka=" + currentPratka + ", receiver=NONE" + ", sender=" + sender + "]";

		}

	}

}
