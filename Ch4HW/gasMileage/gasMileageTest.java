package gasMileage;

import java.util.Scanner;

public class gasMileageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double fMPG = 0;
		int fMiles = 0;
		double fGallons = 0;
		int secMiles = 0;
		double secGallons = 0;
		double secMPG;
		double avgMPG;
		
		while(fMiles >= 0) {
			//trip 1
			System.out.print("Enter miles driven for trip 1 or -1 to exit: ");
			fMiles = input.nextInt();
			
			//if user enters -1, close the program
			while (fMiles == -1) {
				fMiles = -1;
				System.out.print("Closing program . . . ");
			}
			
			//enter gallons prompt
			System.out.print("Enter gallons used for trip 1: ");
			fGallons = input.nextDouble();
			
			//calculations for MPG
			fMPG = fMiles/fGallons;
			
			//display mpg for that trip
			System.out.printf("Your miles per gallon for trip 1 is: %.2f\n", fMPG);
			
			//trip 2
			System.out.print("Enter miles driven for trip 2: ");
			secMiles = input.nextInt();
			
			System.out.print("Enter gallons used for trip 2: ");
			secGallons = input.nextDouble();
			
			//calculations for mpg
			secMPG = secMiles/secGallons;
			
			//display mpg for that trip
			System.out.printf("Your miles per gallon for trip 2 is: %.2f\n", secMPG);
			
			//calculation for average mpg
			avgMPG = ((fMPG + secMPG)/2);
			System.out.printf("Your average MPG is: %.2f\n", avgMPG);
		} //end of loop
	}

}
