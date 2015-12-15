package GSMTask;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	public void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.startsWith("08")) {
			if (simMobileNumber.length() == 10) {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			}

		}
	}

	public void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = new String("");
	}

	public void call(GSM receiver, int duration) {
		if (duration > 0) {
			if (receiver != null && receiver != this) {
				if (this.hasSimCard && receiver.hasSimCard) {
					Call current = new Call();
					current.caller = this;
					current.receiver = receiver;
					current.duration = duration;
					this.lastOutgoingCall = current;
					receiver.lastIncomingCall = current;
					this.outgoingCallDuration += duration;

				}

			}

		}

	}

	public double getSumForCalls() {
		if (lastOutgoingCall == null) {
			return 0.0;
		}
		return (this.outgoingCallDuration * this.lastOutgoingCall.priceForAMinute);
	}

	public void printInfoForLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println(
					"caller:" + this.simMobileNumber + " and receiver:" + this.lastOutgoingCall.receiver.simMobileNumber
							+ " with duration:" + this.lastOutgoingCall.duration + " minutes");
			return;
		}
		System.out.println("No last Ongoing Call");

	}

	public void printInfoForLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println(
					"caller:" + this.simMobileNumber + " and receiver:" + this.lastIncomingCall.receiver.simMobileNumber
							+ " with duration:" + this.lastIncomingCall.duration + " minutes");
			return;
		}
		System.out.println("No last Incoming Call");

	}

	// public static void main(String[] args) {
	// GSM motorola = new GSM();
	// GSM nokia = new GSM();
	//
	// nokia.insertSimCard("0883131929");
	// motorola.insertSimCard("0889342546");
	//
	// // nokia.removeSimCard();
	//
	// nokia.call(motorola, 2);
	//
	// nokia.printInfoForLastOutgoingCall();
	//
	// motorola.printInfoForLastIncomingCall();
	//
	// System.out.println(nokia.getSumForCalls());
	// }
}