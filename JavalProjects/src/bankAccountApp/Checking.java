package bankAccountApp;

public class Checking extends Account {

	//List properties specific to a checking account
	int debitCardNumber;
	int debitCardPIN;
	
	
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		
		super(name,sSN,initDeposit);
		accountNumber = "2" + accountNumber;
		
		setDebitCard();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()*.15;
	}
	
	//List any method specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random()*Math.pow(10,12));
		debitCardPIN 	= (int)(Math.random()*Math.pow(10,4));
	}
	
	public void showInfo() {
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println(
				"Your Checking Account Features " +
				"\nDebit Card Number: " + debitCardNumber +
				"\nDebit Card PIN: " + debitCardPIN
				);
	}
}
