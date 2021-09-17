package displayandSquareofAsteriks;

import java.util.Scanner;

public class displayDisplayofAsterikstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		
		System.out.print("Enter integer for side length: ");
		int sideLenght = data.nextInt();
		
		System.out.print(squareOfAsterisks(sideLenght)); //calling the function;
	}
	
	public static String squareOfAsterisks(int x) {
		String prod = ""; //empty variable 
		
		for (int i = 0; i < x; i++) { //will go through the row
			for (int j = 0; j < x; j++) { //will go through columns
				prod += "* "; //will change the numbers to asterisks
			}
			
			prod += "\n"; //will move to a new line after row length is met
		}
		
		return prod;
	}

}
