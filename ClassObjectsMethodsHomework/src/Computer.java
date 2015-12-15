
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operatingSystem;

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
		Computer mac = new Computer();
		Computer hp = new Computer();
		mac.year = 2010;
		mac.price = 2000;
		mac.isNotebook = false;
		mac.hardDiskMemory = 512;
		mac.freeMemory = 512;
		mac.operatingSystem = new String("MacOS");
		hp.year = 2011;
		hp.price = 1200;
		hp.isNotebook = true;
		hp.hardDiskMemory = 1024;
		hp.freeMemory = 1024;
		hp.operatingSystem = new String("Windows");
		mac.useMemory(100);
		hp.changeOperatingSystem("Linux");
		System.out.println(mac.year + " " + mac.price + " " + mac.isNotebook + " " + mac.hardDiskMemory + " "
				+ mac.freeMemory + " " + mac.operatingSystem);
		System.out.println(hp.year + " " + hp.price + " " + hp.isNotebook + " " + hp.hardDiskMemory + " "
				+ hp.freeMemory + " " + hp.operatingSystem);
	}

}
