package shapeInheritanceHierarchy;

public class shape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimensionalShape twoShape = new TwoDimensionalShape("Pentagon", "Rectangle", "Decagon");
		ThreeDimensionalShape threeShape = new ThreeDimensionalShape("Cone", "Torus", "Octahedron", "Oval", "Hexagon", "Rhombus");
		
		//outputs
		System.out.println(twoShape);//TwoDimensionalShape
		System.out.println();
		System.out.println(threeShape);//ThreeDimensionalShape
	}
	
}


