package Exponentiation;

import java.util.Scanner;

public class exponentiationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		
		//ask user for input and record input
		System.out.print("Enter base number: ");
		int baseNum = data.nextInt(); //record user input
		
		//ask user for input 
		System.out.print("Enter exponent number: ");
		int expo = data.nextInt(); //record user input
		
		//output
		System.out.printf("Answer: %d ", integerPower(baseNum, expo)); //calling the function in the output
	}
	
	//x is base and y is exponent
	public static int integerPower(int x, int y) {
		int product = 1;
		
		for (int i = 1; i <= y; i++) { //base gets multiplied depending on what the value of the exponent 
			product *= x;
		}
		
		return product;
	}
}
