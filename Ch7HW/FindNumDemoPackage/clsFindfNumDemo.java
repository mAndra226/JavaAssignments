package FindNumDemoPackage;

public class clsFindfNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = { 2, 12, 109, 72, 86, 123, 23, 45, 34 };
		int position = -1; //this by convention means not found
		double average = 0.0;
		int largeNum = 0;
		
		//must invoke method
		position = findNumber(numArray, 100);
		System.out.printf("Position: %d%n", position);
		
		System.out.println();
		average = AverageArray(numArray);
		System.out.printf("The Average is: %.2f%n", average);
		
		System.out.println();
		largeNum = FindLargest(numArray);
		System.out.printf("The largest number is: %d%n", largeNum);
		
	} //end main()
	
	//method
	private static int findNumber(int[] testArray, int findNum) {
		boolean found = false; //haven't found it yet
		int index = 0; //start at zero
		int position = -1;
		
		//search the array
		while(!found && (index < testArray.length)) {
			if(testArray[index] == findNum) {
				found = true;
				position = index;
			}
			index++;
		}
		
		return position;
		
	}
	
	private static double AverageArray(int[] testArray) {
		int total = 0;
		double average = 0.0;
		
		//first get total of all elements of array - iterate though the array
		for(int i = 0; i < testArray.length; i++) {
			total += testArray[i]; //adding up all the elements of the array
		}
		
		average = (double) total / testArray.length;
		return average;
	}
	
	//method that finds the largest number in array
	private static int FindLargest(int[] testArray) {
		int largeNum = 0;
		
		largeNum = testArray[0]; //assume first element at index 0 is largest
		
		//find largest
		for(int i = 1; i < testArray.length; i++) {
			if(testArray[i] > largeNum) {
				largeNum = testArray[i];
			}
		}
		
		return largeNum;
	}
} //end class
