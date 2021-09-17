package carProgram;

import java.util.Scanner;

public class carTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		carClass car1 = new carClass("Nissan", "Rogue", 2017, 70);
		
		int choice = 1;

		//title
		System.out.println("Increase / decrease speed or enter zero to close program");
		
		while(choice != 0) {
			System.out.print("Increase or decrease speed: ");
			choice = input.nextInt();
			
			if(choice == 0) { //if the user inputs zero, show final speed and close program
				System.out.printf("The cars final speed is: %d", car1.getCarSpeed());
			} else {
				System.out.printf("Current speed is: %d%n", car1.getCarSpeed());
			}
		} //end while loop
	}

}
