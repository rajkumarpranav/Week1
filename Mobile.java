package week1.day1;

public class Mobile {
	String mobModel = "samsung";
	int mobWeight = 20;
	boolean isFullyCharged = true;
	int mobCost = 50000;

	public void makeCall() {
		System.out.println("Ready Make a Call");
	}

	public void sendMessage() {
		System.out.println("Ready Send a Message");
	}

	public static void main(String[] args) {
		Mobile mySamsung = new Mobile();
		mySamsung.makeCall();
		mySamsung.sendMessage();
		System.out.println(mySamsung.mobModel);
		System.out.println(mySamsung.mobWeight);
		System.out.println(mySamsung.isFullyCharged);
		System.out.println(mySamsung.mobCost);
	}
}
