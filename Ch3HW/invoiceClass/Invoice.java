package invoiceClass;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	private double invoiceAmount;
	
	//constructor
	public Invoice(String partNumber, String partDescription, int quantity, double price)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
		
		invoiceAmount = (quantity * price); //invoice amount is the quantity multiplied by the price
		
		//if the quantity is less than zero, set it equal to zero
		if(quantity < 0) { 
			this.quantity = 0;
		}
		
		//if the price per item is not positive, set it equal to 0
		if(price < 0.0) { 
			this.price = 0.0;
		} 
	}
	
	//set method for partNumber
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	//get method for partNumber
	public String getPartNumber() {
		return this.partNumber;
	}
	
	//set method for partDescription
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	//get method for partDescription
	public String getPartDescription() {
		return this.partDescription;
	}
	
	//set method for quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//get method for quantity
	public int getQuantity() {
		return this.quantity;
	}
	
	//set method for price
	public void setPrice(double price) {
		this.price = price;
	}
	
	//get method for price
	public double getPrice() {
		return this.price;
	}
	
	//set method for price
	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	
	//get method for price
	public double getInvoiceAmount() {
		return this.invoiceAmount;
	}
}
