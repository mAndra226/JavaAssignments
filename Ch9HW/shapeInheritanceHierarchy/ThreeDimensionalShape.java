package shapeInheritanceHierarchy;

public class ThreeDimensionalShape extends TwoDimensionalShape {
	private String cone;
	private String torus;
	private String octahedron;
	
	//constructor
	public ThreeDimensionalShape(String cone, String torus, String octahedron, String pentagon, String rectangle, String decagon) {
		//MUST be first line of code in subclass/ derived constructor
		super(pentagon, rectangle, decagon);//calls base constructor
		
		this.cone = cone;
		this.torus = torus;
		this.octahedron = octahedron;
	}
	
	public void setCone(String cone) {
		this.cone = cone;
	}
	
	public String getCone() {
		return this.cone;
	}
	
	public void setTorus(String torus) {
		this.torus = torus;
	}
	
	public String getTorus() {
		return this.torus;
	}
	
	public void setOctahedron(String octahedron) {
		this.octahedron = octahedron;
	}
	
	public String getOctahedron() {
		return this.octahedron;
	}
	
	@Override
	public String toString() {
		return String.format("The shapes %s, %s, %s, are three-dimensional shapes. The shapes %s, %s, %s, are two-dimensional shapes.", 
				getCone(), getTorus(), getOctahedron(), getPentagon(), getRectangle(), getDecagon());
	}
	
}
