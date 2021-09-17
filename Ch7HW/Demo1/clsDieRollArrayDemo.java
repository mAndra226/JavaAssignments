package Demo1;

import java.security.SecureRandom;

public class clsDieRollArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom rn = new SecureRandom(); //random object
		int result = 0;
		
		//declare array  (arrays are always zero based)
		int [] dieArray = new int[6];
		
		for(int i = 0; i < 6000000; i++) {
			//dieArray[rn.nextInt(6)]++; //does the same as below
			
			//easier to understand???
			result = rn.nextInt(6); //generates a number from 0 - 5
			dieArray[result]++; //use number generated as index into array, then increment by one
		}

		System.out.println("Results: ");
		
		for(int j = 0; j < dieArray.length; j++) {
			System.out.printf("%5d%10d%n", j + 1, dieArray[j]); //%5d is a placeholder for an integer of 5 digits
		}
		
	}

}
