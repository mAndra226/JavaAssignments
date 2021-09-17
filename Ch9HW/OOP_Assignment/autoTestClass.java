package OOP_Assignment;

public class autoTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automobileClass oCar = new automobileClass("Ford", "Focus", 2018, "red");
		sportsCarClass sCar = new sportsCarClass("Porsche", "911", 2018, "blue", 80, "auto");
		
		//outputs
		System.out.println(oCar); //automobileClassa
		System.out.println();
		System.out.println(sCar);//sportsCarClass
	}
}
