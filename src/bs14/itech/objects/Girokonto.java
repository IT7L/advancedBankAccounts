package bs14.itech.objects;

import bs14.itech.interfaces.BankAccount;

public class Girokonto implements BankAccount {

	private String accountNumber;
	private String accountHolder;
	private double balance;
	private double diporahmen;
	private double creditInterest;
	private int pin;
	
	public Girokonto(String provAccountNumber, String provAccountHolder, double provBalance, double provDiporahmen, double provCreditInterest, int provPin) {
		accountNumber = provAccountNumber;
		accountHolder = provAccountHolder;
		balance = provBalance;
		diporahmen = provDiporahmen;
		creditInterest = provCreditInterest;
		pin = provPin;
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String getAccountHolder() {
		return accountHolder;
	}

	@Override
	public double getAccountBalance() {
		return balance;
	}

	@Override
	public boolean comparePin(int provPin) {
		if (provPin == pin) {
			return true;
		} else {
			return false;	
		}
	}

	@Override
	public void paymentIn(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}
	
	public void paymentOut(double amount) {
		if (amount > 0) {
			balance = balance - amount;
		}
	}
	
}
