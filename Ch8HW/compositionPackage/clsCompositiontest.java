package compositionPackage;

public class clsCompositiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clsSavings s1 = new clsSavings(1000);
		clsCustomer oCust1 = new clsCustomer("Bill", "Murray", s1);
		
		System.out.println(oCust1);
	}

}
