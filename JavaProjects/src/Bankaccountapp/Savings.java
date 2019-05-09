package Bankaccountapp;

public class Savings extends Account{
	
	//List the properties specific to a saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	//Constructor to initialize settings for savings account properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	//List any methods specific to the savings account
	public void showInfo() {
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
				" Your Savings Account Features: "  +
		"\n Safety Deposit Box ID: " + safetyDepositBoxID +
		"\n Safety Deposit Box Access Code: " + safetyDepositBoxKey
				);		
}

} 
