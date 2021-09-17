package barChartPrintingProgram;

import java.util.Scanner;

public class barChartPrintingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		      
		//prompt user
		System.out.printf("Enter five numbers from 1 to 30: ");
		
		for(int i = 0; i < 5; i++) {
			num = input.nextInt();
		     
			//checks if user inputs too many numbers or no numbers
			if(num > 30 || num < 1) {
				System.out.println("Out of Range, please Re-Enter . . . ");
				num = input.nextInt();
		    }
			
			//print (*) equivalent to the number inputed by the user
		    for(int j = 1; j <= num; j++) {
		    	System.out.printf("*");
		    }
		   
		    System.out.println();
		 }
	}
}
