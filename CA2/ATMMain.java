public class ATMMain {

	public static void main(String[] args) {
		SubjectATM atm = new ProxyATM(123, 456, 789);

		atm.displayInfo();
		System.out.println("\n");
		atm.displayInfo();
	}

}
