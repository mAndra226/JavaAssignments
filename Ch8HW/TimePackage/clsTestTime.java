package TimePackage;

public class clsTestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clstime t1 = new clstime();
		clstime t2 = new clstime(3);
		clstime t3 = new clstime(15, 20);
		clstime t4 = new clstime(14, 45, 15);
		clstime t5 = new clstime(t4);
		
		try {
			displayTime("t1", t1);
			displayTime("t2", t2);
			displayTime("t3", t3);
			displayTime("t4", t4);
			displayTime("t5", t5);
			
			//test bad data
			clstime t6 = new clstime(24, 45, 65); //bad data
			displayTime("t6", t6); //should skip
		} 
		
		catch(IllegalArgumentException e) {
			System.out.printf("Exception: %s%n", e.getMessage());
		}
	}
	
	private static void displayTime(String strName, clstime t) {
		System.out.printf("%s%n %s%n %s%n", strName, t.toUniversalString(), t);
	}

}
