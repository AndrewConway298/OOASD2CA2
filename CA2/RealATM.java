public class RealATM implements SubjectATM {

	private int cardNum;
	private int accountNum;
	private int balance;

	public RealATM(int cardNum, int accountNum, int balance) {
		this.cardNum = cardNum;
		this.accountNum = accountNum;
		this.balance = balance;
		loadLocal(cardNum, accountNum, balance);
	}

	public void displayInfo() {
		System.out.println("Displaying details: \nCard Number: " + cardNum + "\nAccount Number: " + accountNum
					+ "\nAccount Balance: " + balance);
	}

	private void loadLocal(int cardNum, int accountNum, int balance){
		System.out.println("Loading details: \nCard Number: " + cardNum + "\nAccount Number: " + accountNum
					+ "\nAccount Balance: " + balance);
	}

}
