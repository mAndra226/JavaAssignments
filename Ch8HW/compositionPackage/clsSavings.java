package compositionPackage;

public class clsSavings {
	private double balance = 0;

	public clsSavings(double balance) {
		if(balance > 0) {
			this.balance = balance;
		} else {
			throw new IllegalArgumentException("Balance > 0");
		}
	}
	
	public void creditBalance(double deposit) {
		this.balance += deposit; //data validation would be 
	}
	
	public void debitbalance(double debit) {
		this.balance -= balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	//override toString()
	public String toString() {
		return String.format("$%.2f", balance);
	}
}
