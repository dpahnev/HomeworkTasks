import java.util.List;

public abstract class Client extends Person {

	private String addres;
	private LocalOffice currentOffice;

	public Client(String addres, LocalOffice current) {
		this.addres = addres;
		this.currentOffice = current;
	}

	public void send(Pratka pratka) {
		// Office currentOffice = getCurrentOffice();
		Protocol protocol = new Protocol(pratka, this);
		currentOffice.add(protocol);
	}

	public void send(List<Protocol> pratki) {
		for (Protocol protocol : pratki) {
			currentOffice.add(protocol);
		}
	}

	public void sent(List<Pratka> listPratkiNepodgotveni) {
		for (Pratka pratka : listPratkiNepodgotveni) {
			currentOffice.add(new Protocol(pratka, this));
		}
	}

	public LocalOffice getCurrentOffice() {
		return currentOffice;
	}

	public String getAddres() {
		return addres;
	}

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object obj);

	@Override
	public String toString() {
		return "Client [addres=" + addres + ", currentOffice=" + currentOffice.toString() + "] [" + super.toString()
				+ "]";
	}

}
