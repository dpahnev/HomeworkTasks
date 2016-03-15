import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Office {

	private String city;

	private static Map<LocalDateTime, List<Protocol>> registry = new ConcurrentHashMap<>();
	private static Map<Integer, Pratka> allPratki = new ConcurrentHashMap<>();
	private static Map<Integer, List<Protocol>> allProtocols = new ConcurrentHashMap<>();
	private static Set<Individual> allClients = new TreeSet<>();

	public Office(String city) {
		this.city = city;
	}

	public void makeRegistry(Protocol protocol) {
		// System.out.println("emi she vleze sega");
		synchronized (registry) {
			// System.out.println("vlqzohme");
			LocalDateTime currentTime = LocalDateTime.now();
			if (!registry.containsKey(currentTime)) {
				List<Protocol> protokols = Collections.synchronizedList(new LinkedList<>());
				protokols.add(protocol);
				registry.put(currentTime, protokols);
			} else {
				List<Protocol> currentProtocolList = registry.get(currentTime);
				currentProtocolList.add(protocol);
				// registry.put(currentTime, currentProtocolList);
			}
			// for (List<Protocol> temp : registry.values()) {
			// System.out.println("razmera e" + temp.size());
			// }
		}
		Integer id = new Integer(protocol.getPratka().getId());
		List<Protocol> listProtocols;
		synchronized (allProtocols) {
			if (!allProtocols.containsKey(id)) {
				listProtocols = Collections.synchronizedList(new LinkedList<Protocol>());
				listProtocols.add(protocol);
			} else {
				listProtocols = allProtocols.get(id);
				listProtocols.add(protocol);
			}
			allProtocols.put(id, listProtocols);
		}
	}

	public Pratka getPratkaById(int id) throws SmartCourierException {
		if (allPratki.containsKey(id)) {
			return allPratki.get(id);
		}
		throw new SmartCourierException("Sujalqvame no tova ID koeto tursite ne sushtestvuva.");

	}

	public void addPratkaToRegistry(Pratka current) {
		if (!allPratki.containsKey(current.getId())) {
			synchronized (allPratki) {
				allPratki.put(current.getId(), current);
			}
		}
	}

	public String getCity() {
		return city;
	}

	public static void spravkaById(int intId) {
		Integer id = new Integer(intId);
		Pratka pratka = allPratki.get(id);
		System.out.println(pratka.toString());
		Protocol lastProtocol = allProtocols.get(id).get(0);
		System.out.println(lastProtocol.toString());
	}

	public static void allProtocolsByPratka(int intId) throws SmartCourierException {
		Integer id = new Integer(intId);
		if (!allProtocols.containsKey(id))
			throw new SmartCourierException("Sujalqvame no tova ID koeto tursite ne sushtestvuva.");
		List<Protocol> protocolsToPrint = allProtocols.get(id);
		System.out.println("boroq e :" + protocolsToPrint.size() + " =" + registry.size());
		for (Protocol current : protocolsToPrint) {
			System.out.println(current.toString());
		}
	}

	public static void allClients() {
		for (Client client : allClients) {
			System.out.println(client.toString());
		}
	}

	public static void addClient(Individual individual) {
		allClients.add(individual);
	}

	public static void allProtocolsByTime() {

		for (LocalDateTime time : registry.keySet()) {
			System.out.println(time.toString() + " : ");
			for (Protocol temp : registry.get(time)) {
				System.out.println(temp.toString());
			}
		}
	}

}