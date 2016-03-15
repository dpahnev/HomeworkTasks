import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class MainOffice extends Office implements Runnable {

	private Queue<Protocol> pratki = new LinkedBlockingQueue<>();
	private Map<String, Queue<Protocol>> deliveryDestination = new ConcurrentHashMap<>();

	@Override
	public void run() {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		while (true) {
			// System.out.println("--aide be");
			// System.out.println(pratki.size());
			// System.out.println("predi bloka");
			while (!pratki.isEmpty()) {
				Protocol temp;
				synchronized (pratki) {
					temp = pratki.poll();
				}
				String city = temp.getPratka().getReceiver().getCurrentOffice().getCity();
				synchronized (deliveryDestination) {
					if (!deliveryDestination.containsKey(city)) {
						deliveryDestination.put(city, new LinkedBlockingQueue<Protocol>());
					}
					Queue<Protocol> cityList = deliveryDestination.get(city);
					cityList.add(temp);
					// deliveryDestination.put(city, cityList);
				}
			}
			// System.out.println("sled blok");

			synchronized (pratki) {

				try {
					// System.out.println("vadim");
					// for (Protocol protocol : pratki) {
					// System.out.println(protocol.toString());
					// }
					// System.out.println();
					// System.out.println("size: " +
					// deliveryDestination.size());
					// System.out.println("shte spim");
					pratki.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					return;
				}
			}
			// System.out.println("sled blok 1");
		}
	}

	public MainOffice(String city) {
		super(city);
		// TODO Auto-generated constructor stub
	}

	public void add(Protocol curr) {
		// System.out.println("kurec" + Thread.currentThread().getName() + "---"
		// + pratki.size());
		synchronized (pratki) {
			// System.out.println("vutre" + Thread.currentThread().getName() +
			// "---" + pratki.size());
			pratki.add(curr);
			pratki.notifyAll();
		}

	}

	public boolean isEmpty() {
		return pratki.isEmpty();
	}

	public Protocol getByCity(String city) throws SmartCourierException {
		// for (String citys : deliveryDestination.keySet()) {
		// for (Protocol cur : deliveryDestination.get(citys)) {
		// System.out.println(cur.toString());
		// }
		// }
		synchronized (deliveryDestination) {
			// System.out.println("panaiot!");
			if (!deliveryDestination.containsKey(city)) {
				deliveryDestination.put(city, new LinkedBlockingQueue<Protocol>());
			}
		}
		while (true) {
			// System.out.println(i.incrementAndGet());
			synchronized (deliveryDestination) {
				Queue<Protocol> cityList = deliveryDestination.get(city);
				if (!cityList.isEmpty()) {
					Protocol result = cityList.poll();
					// deliveryDestination.put(city, cityList);
					// System.out.println("gotovi sme");
					return result;
				} else {
					synchronized (deliveryDestination) {
						// System.out.println("kurec ne se subujda");
						deliveryDestination.notifyAll();
					}
					synchronized (deliveryDestination) {
						try {
							deliveryDestination.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public Pratka getPratkaById(int id) throws SmartCourierException {
		return super.getPratkaById(id);
	}

}
