package bs14.itech;

import bs14.itech.interfaces.BankAccount;
import bs14.itech.objects.Girokonto;
import bs14.itech.objects.SavingsAccount;

public class Main {

	private static SavingsAccount savings1;
	private static Girokonto giro1;
	
	public static void main(String[] args) {
		savings1 = new SavingsAccount("ImAAccountNumber", "ImAAccountHolder", 15.0, 1.2, 1234);
		giro1 = new Girokonto("ImAlsoAAccountNumber", "ImAlsoAAccountHolder", 500.00, 100000.00, 2.1, 4321);
		
		printAccountInformation(savings1, 1234);
		printAccountInformation(giro1, 4321);
	}

	
	public static void printAccountInformation(BankAccount account, int pinToTest) {
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Holder: " + account.getAccountHolder());
		if (account instanceof SavingsAccount) {
			System.out.println("Type: SavingsAccount");
		} else if (account instanceof Girokonto) {
			System.out.println("Type: Girokonto");
		}
		System.out.println("Account Balance: " + account.getAccountBalance());
		if (account.comparePin(pinToTest)) {
			System.out.println("Provided Pin '" + pinToTest + "' does match the Accounts credentials" );
		} else {
			System.out.println("WARNING Provided Pin '" + pinToTest + "' does not match the Accounts credentials" );
		}
		if (account instanceof SavingsAccount) {
			System.out.println("Assessment Number: " + ((SavingsAccount) account).getAssessmentNumber());
		} else if (account instanceof Girokonto) {
			((Girokonto) account).paymentOut(2.5); 	
			System.out.println("Account Balance after Usage: " + account.getAccountBalance());
		}
		System.out.println();
	}
}
