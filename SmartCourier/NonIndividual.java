
public class NonIndividual extends Client {

	private String bulstat;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bulstat == null) ? 0 : bulstat.hashCode());
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
		NonIndividual other = (NonIndividual) obj;
		if (bulstat == null) {
			if (other.bulstat != null)
				return false;
		} else if (!bulstat.equals(other.bulstat))
			return false;
		return true;
	}

	public NonIndividual(String addres, LocalOffice current) {
		super(addres, current);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NonIndividual [bulstat=" + bulstat + "]";
	}

}
