package bs14.itech.interfaces;

public interface BankAccount {
	public String getAccountNumber();
	public String getAccountHolder();
	public double getAccountBalance();
	
	public boolean comparePin(int provPin);
	public void paymentIn(double amount);
}
