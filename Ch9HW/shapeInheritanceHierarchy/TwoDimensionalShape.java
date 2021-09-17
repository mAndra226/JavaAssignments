package shapeInheritanceHierarchy;

public class TwoDimensionalShape {
	private String pentagon;
	private String rectangle;
	private String decagon;
	
	//constructor
	public TwoDimensionalShape(String pentagon, String rectangle, String decagon) {
		this.pentagon = pentagon;
		this.rectangle = rectangle;
		this.decagon = decagon;
	}
	
	public void setPentagon(String pentagon) {
		this.pentagon = pentagon;
	}
	
	public String getPentagon() {
		return this.pentagon;
	}
	
	public void setRectangle(String rectangle) {
		this.rectangle = rectangle;
	}
	
	public String getRectangle() {
		return this.rectangle;
	}
	
	public void setDecagon(String decagon) {
		this.decagon = decagon;
	}
	
	public String getDecagon() {
		return this.decagon;
	}
	
	@Override
	public String toString() {
		return String.format("The shapes %s, %s, %s, are two-dimensional shapes.", getPentagon(), getRectangle(), getDecagon());
	}
	
}
