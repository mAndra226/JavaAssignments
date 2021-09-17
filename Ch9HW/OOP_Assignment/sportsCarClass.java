package OOP_Assignment;

public class sportsCarClass extends automobileClass {
	//hidden encapsulated data
	private int carSpeed;
	private String carTransmission;
	
	public sportsCarClass(String cMake, String cModel, int cYear, String cColor, int speed, String trans) {
		//MUST be first line of code in subclass/ derived constructor
		super(cMake, cModel, cYear, cColor);//calls base constructor
		
		this.carSpeed = speed;
		this.carTransmission = trans;
	}
	
	public void setCarSpeed(int speed) {
		this.carSpeed = speed;
	}
	
	public int getCarSpeed() {
		return this.carSpeed;
	}
	
	public void setCarTrans(String trans) {
		this.carTransmission = trans;
	}
	
	public String getCarTrans() {
		return this.carTransmission;
	}
	
	@Override
	public String toString() {
		return String.format("The automobile make is %s, the model is %s, the year is %d, the color is %s, the speed is %dmph and the transmission is %s.", 
				getCarMake(), getCarModel(), getCarYear(), getCarColor(), getCarSpeed(), getCarTrans());
	}
}
