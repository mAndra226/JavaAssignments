package controlStructure;

import java.util.Scanner;

public class controlStructureClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		      
		//prompt user
		System.out.printf("Enter any integer from 1 to 25: ");
		int num = input.nextInt();
		
				
		//loop that increments from 1 -> 7
		for(int i = 1; i <= num; i++) { //loops through row
			for(int j = 0; j <= i; j++) {//loops through column
				System.out.print("*"); //output * in place of numbers
			} 
			
			System.out.println();
		}
		
		//reversing the original loop from 7 -> 1
				for(int i = 0; i <= num-1; i++) { //num-1 makes it start at 6 because we don't want 7 to output again
					for(int j = num; j > i; j--) {  //this loops through the column
						System.out.print("*");//output * in place of numbers
					}
					System.out.println();
				}
	}
}
