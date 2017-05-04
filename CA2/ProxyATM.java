public class ProxyATM implements SubjectATM {

	private RealATM realATM;
	private int cardNum;
	private int accountNum;
	private int balance;

	public ProxyATM(int cardNum, int accountNum, int balance) {
		this.cardNum = cardNum;
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public void displayInfo() {
		if(realATM == null){
			realATM = new RealATM(cardNum, accountNum, balance);
		}
		realATM.displayInfo();
	}

}
