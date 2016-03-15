
public class Individual extends Client implements Comparable<Individual> {

	private String name;
	private String GSM;
	private String EGN;

	public Individual(String addres, String name, String gSM, String eGN, LocalOffice current) {
		super(addres, current);
		this.name = name;
		GSM = gSM;
		EGN = eGN;
	}

	@Override
	public void send(Pratka pratka) {
		Office.addClient(this);
		super.send(pratka);
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EGN == null) ? 0 : EGN.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Individual other = (Individual) obj;
		if (EGN == null) {
			if (other.EGN != null)
				return false;
		} else if (!EGN.equals(other.EGN))
			return false;
		return true;
	}

	@Override
	public int compareTo(Individual other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Individual [name=" + name + ", GSM=" + GSM + ", EGN=" + EGN + "] [" + super.toString() + "]";
	}

}
