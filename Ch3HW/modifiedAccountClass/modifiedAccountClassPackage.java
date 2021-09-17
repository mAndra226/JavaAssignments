package modifiedAccountClass;

public class modifiedAccountClassPackage {
	private String name; //instance variable
	private double balance; //instance variable
	private double withdraw; //instance variable
	
	//constructor
	public modifiedAccountClassPackage(String name, double balance)
	{
		this.name = name;
		
		//if the balance is a valid amount (greater than zero)
		if (balance > 0.0) {
			this.balance = balance; //assign it to instance variable balance
		} 
	}
	
	public void deposit(double depositAmount)
	{
		//if the deposit amount is valid add it to the balance
		if (depositAmount > 0.0) { 
			balance = balance + depositAmount; 
		}
	}
	
	public void withdraw(double withdrawQuantity)
	{ 
		//if the withdraw amount is greater than the current balance, alert error, else remove from balance
		if (withdrawQuantity > balance)
		{
			System.out.println("ERROR: Withdrawal amount exceeds account balance.");
		} else {
			balance = (balance - withdrawQuantity);
		}
	}
	
	//method returns the account withdraw
	public double getWithdraw() {
		return withdraw;
	}

	//method returns the account balance
	public double getBalance() {
		return balance;
	}
	
	//method that sets the name
	public void setName(String name) {
		this.name = name;
	}
	
	//method that returns the name
	public String getName() {
		return name;
	}
}
