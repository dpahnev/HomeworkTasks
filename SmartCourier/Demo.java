import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Demo {

	static MainOffice velikoTurnovo = new MainOffice("Veliko Turnovo");
	static LocalOffice sofia = new LocalOffice("Sofiq");
	static LocalOffice plovdiv = new LocalOffice("Plovdiv");
	static LocalOffice varna = new LocalOffice("Varna");
	static LocalOffice ruse = new LocalOffice("Ruse");
	static Individual spamer1 = new Individual("okolovrushtnoto", "kaiman", "0888888", "6486153156", varna);
	static Individual spamer2 = new Individual("na mosta", "mainaMen", "0324888888", "64823153156", plovdiv);
	static Individual spamer3 = new Individual("Stud.Grad", "maria", "08450125", "6483153156", sofia);
	static Individual spamer4 = new Individual("banishora", "galmak", "0888888", "6486153152", ruse);
	static List<Protocol> pratki = new ArrayList<>();

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			Pratka currentPratka = new Pratka(spamer1, spamer3);
			pratki.add(new Protocol(currentPratka, spamer1));
		}
		for (int i = 0; i < 2; i++) {
			Pratka currentPratka = new Pratka(spamer1, spamer2);
			pratki.add(new Protocol(currentPratka, spamer1));

		}
		for (int i = 0; i < 3; i++) {
			Pratka currentPratka = new Pratka(spamer1, spamer4);
			pratki.add(new Protocol(currentPratka, spamer1));
		}
		{
			Pratka currentPratka = new Pratka(spamer3, spamer4);
			pratki.add(new Protocol(currentPratka, spamer3));
		}
		for (int i = 0; i < 2; i++) {
			Pratka currentPratka = new Pratka(spamer3, spamer1);
			pratki.add(new Protocol(currentPratka, spamer3));
		}
		for (int i = 0; i < 2; i++) {
			Pratka currentPratka = new Pratka(spamer3, spamer2);
			pratki.add(new Protocol(currentPratka, spamer3));
		}
		ThreadGroup group = new ThreadGroup("nishki");
		LinkedList<Thread> threadsToBeJoined = new LinkedList<>();
		threadsToBeJoined.add((new Thread(group, velikoTurnovo)));

		threadsToBeJoined
				.add((new Thread(group, new DeliverToCentral("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, sofia))));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToCentral("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, plovdiv)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToCentral("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, varna)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToCentral("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, ruse)));

		threadsToBeJoined
				.add(new Thread(group, new DeliverToCity("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, sofia)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToCity("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, plovdiv)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToCity("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, varna)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToCity("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, ruse)));

		threadsToBeJoined
				.add(new Thread(group, new DeliverToClient("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, sofia)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToClient("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, plovdiv)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToClient("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, varna)));
		threadsToBeJoined
				.add(new Thread(group, new DeliverToClient("tjbrnj", "nvrjnj", "urnvrjnvj", velikoTurnovo, ruse)));

		for (Thread thread : threadsToBeJoined) {
			thread.start();
		}

		for (Protocol pratka : pratki) {
			Pratka current = pratka.getPratka();
			Client temp = current.getSender();
			temp.send(current);
		}
		AtomicBoolean isSlept = new AtomicBoolean(false);
		while (!isSlept.get()) {
			for (Thread thread2 : threadsToBeJoined) {
				if (!thread2.getState().equals(State.WAITING)) {
					isSlept.set(true);
				}
			}
		}
		for (Thread thread2 : threadsToBeJoined) {
			try {
				thread2.interrupt();
			} catch (Exception e) {

			}
		}
		// ne e pusnata zaqvka tq e na Office.(static)
		Office.allProtocolsByTime();

	}

}
