import java.util.concurrent.atomic.AtomicInteger;

public class Pratka {
	private Client sender;
	private Client receiver;
	private Integer id;
	private boolean isDelivered = false;
	private static AtomicInteger idGenerator;

	static {
		idGenerator = new AtomicInteger(0);
	}

	public Pratka(Client sender, Client receiver) {
		super();
		id = new Integer(idGenerator.get());
		idGenerator.incrementAndGet();
		this.sender = sender;
		this.receiver = receiver;
	}

	public Client getSender() {
		return sender;
	}

	public Client getReceiver() {
		return receiver;
	}

	public Integer getId() {
		return id;
	}

	public void deliver() {
		isDelivered = true;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	@Override
	public String toString() {
		return "Pratka [sender=" + sender.toString() + ", receiver=" + receiver.toString() + ", id=" + id
				+ ", isDelivered=" + isDelivered + "]";
	}

	public static void main(String[] args) {
	}
}
