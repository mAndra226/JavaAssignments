package OOP_Assignment;

public class automobileClass {
	private String carMake;
	private String carModel;
	private int carYear;
	private String carColor;
	
	//constructor
	public automobileClass(String make, String model, int year, String color) {
		this.carMake = make;
		this.carModel = model;
		this.carYear = year;
		this.carColor = color;
	}
	
	//accessor 
	public void setCarMake(String make) {
		this.carMake = make;
	}
	
	public String getCarMake() {
		return this.carMake;
	}
	
	public void setCarModel(String model) {
		this.carModel = model;
	}
	
	public String getCarModel() {
		return this.carModel;
	}
	
	public void setCarYear(int year) {
		this.carYear = year;
	}
	
	public int getCarYear() {
		return this.carYear;
	}
	
	public void setCarColor(String color) {
		this.carColor = color;
	}
	
	public String getCarColor() {
		return this.carColor;
	}
	
	@Override
	public String toString() {
		return String.format("The automobile make is %s, the model is %s, the year is %d and the color is %s.", carMake, carModel, carYear, carColor);
	}
}
