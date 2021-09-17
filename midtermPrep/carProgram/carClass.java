package carProgram;

public class carClass {
	//instance variable
	private String make;
	private String model;
	private int year;
	private int speed;
	private int incSpeed;
	private int decSpeed;
	
	
	//constructor
	public carClass(String carMake, String carModel, int carYear, int carSpeed) {
		this.make = carMake;
		this.model = carModel;
		this.year = carYear;
		this.speed = carSpeed;
	}
	
	public void setCarMake(String carMake) {
		this.make = carMake;
	}
	
	public String getCarMake() {
		return this.make;
	}
	
	public void setCarModel(String carModel) {
		this.model = carModel;
	}
	
	public String getCarModel() {
		return this.model;
	}
	
	public void setCarYear(int carYear) {
		this.year = carYear;
	}
	
	public int getCarYear() {
		return this.year;
	}
	
	public void setCarSpeed(int carSpeed) {
		this.speed = carSpeed;
		
	}
	
	public int getCarSpeed() {
		return this.speed;
	}
	
	//increment speed if positive input
	public void increaseSpeed(int increase) {
		this.incSpeed = speed + increase;
	}

	//decrement speed if negative input
	public void decreaseSpeed(int decrease) {
		this.decSpeed = speed - decrease;
	}
}
