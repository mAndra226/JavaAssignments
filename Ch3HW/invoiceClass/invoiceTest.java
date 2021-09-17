package invoiceClass;

public class invoiceTest {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("1", "Screwdriver", 6, 5.50);
		Invoice invoice2 = new Invoice("2", "Drill", 2, 24.00);
		Invoice invoice3 = new Invoice("3", "Hammer", 3, 6.99);
		
		//Output
		System.out.printf("%s %s %s $%.2f Total: $%.2f%n", invoice1.getPartNumber(), invoice1.getPartDescription(), invoice1.getQuantity(), invoice1.getPrice(), invoice1.getInvoiceAmount());
		System.out.printf("%s %s %s $%.2f Total: $%.2f%n", invoice2.getPartNumber(), invoice2.getPartDescription(), invoice2.getQuantity(), invoice2.getPrice(), invoice2.getInvoiceAmount());	
		System.out.printf("%s %s %s $%.2f Total: $%.2f%n", invoice3.getPartNumber(), invoice3.getPartDescription(), invoice3.getQuantity(), invoice3.getPrice(), invoice3.getInvoiceAmount());
	}
}

