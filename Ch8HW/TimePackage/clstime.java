package TimePackage;

public class clstime {
	//hidden encapsulated data . . . 
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	
	//overloaded constructors for Time Class
	public clstime(int hours, int minutes, int seconds) {
		//data validation
		if(hours < 0 || hours >= 24) {
			throw new IllegalArgumentException("Invalid Hours ");
		}
		
		if(minutes < 0 || minutes >= 60) {
			throw new IllegalArgumentException("Invalid Minutes");
		}
		
		if(seconds < 0 || seconds >= 60) {
			throw new IllegalArgumentException("Invalid Seconds");
		}
		
		//if data is good, store it . . .
		this.hours = hours; //shadowing
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public clstime(int hours, int minutes) {
		//overloaded constructor calling another constructor . . .
		this(hours, minutes, 0);
	}
	
	public clstime(int hour) {
		this(hour, 0, 0);
	}
	
	public clstime() {
		this(0, 0, 0);
	}
	
	//another overloaded constructor that takes in a time object
	public clstime(clstime t) {
		this(t.getHours(), t.getMinutes(), t.getSeconds());
	}
	
    //accessor methods
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public int getSeconds() {
		return this.seconds;
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
	}
	
	//override toString method
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hours == 0 || hours == 12) ? 12 : hours % 12), minutes, seconds, (hours < 12 ? "AM" : "PM"));
	}
}
