package compositionPackage;

public class clsCustomer {
	private String fName = "";
	private String lName = "";
	private clsSavings sAccount; //composition
	
	public clsCustomer(String fName, String lName, clsSavings s) {
		this.fName = fName;
		this.lName = lName;
		this.sAccount = s;
	}
	
	public String toString() {
		return String.format("%s %s balance: %s%n", fName, lName, sAccount);
	}
}
