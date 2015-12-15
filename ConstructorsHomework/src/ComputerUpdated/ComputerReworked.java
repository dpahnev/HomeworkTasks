package ComputerUpdated;

public class ComputerReworked {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operatingSystem;

	ComputerReworked() {
		this.isNotebook = false;
		this.operatingSystem = "Win XP";
	}

	ComputerReworked(int year, double price, int hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	ComputerReworked(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operatingSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operatingSystem = operatingSystem;
	}

	public int comparePrice(ComputerReworked c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price == c.price) {
			return 0;
		}
		return 1;
	}

	public void changeOperatingSystem(String newOperatingSystem) {
		this.operatingSystem = newOperatingSystem;
	}

	public void useMemory(int memory) {
		if (freeMemory < memory) {
			System.out.println("Not enough free memory");
			return;
		} else if (memory < 0) {
			return;
		}
		freeMemory = freeMemory - memory;
	}

	public static void main(String[] args) {
		ComputerReworked mac = new ComputerReworked(2010, 2000, 512, 512);
		ComputerReworked hp = new ComputerReworked(2011, 1200, true, 1024, 1024, "Win XP");
		ComputerReworked lenovo = new ComputerReworked();
		mac.useMemory(100);
		lenovo.price = 1200;
		hp.changeOperatingSystem("Linux");
		mac.changeOperatingSystem("Mac OS");
		System.out.println(mac.comparePrice(hp));
		System.out.println(lenovo.comparePrice(hp));
		System.out.println(lenovo.comparePrice(mac));
		System.out.println(mac.year + " " + mac.price + " " + mac.isNotebook + " " + mac.hardDiskMemory + " "
				+ mac.freeMemory + " " + mac.operatingSystem);
		System.out.println(hp.year + " " + hp.price + " " + hp.isNotebook + " " + hp.hardDiskMemory + " "
				+ hp.freeMemory + " " + hp.operatingSystem);
		System.out.println(lenovo.year + " " + lenovo.price + " " + lenovo.isNotebook + " " + lenovo.hardDiskMemory
				+ " " + lenovo.freeMemory + " " + lenovo.operatingSystem);
	}

}
