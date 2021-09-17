package oddOrEven;

import java.util.Scanner; //used for input from console

public class oddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//variables
		int num;
		
		System.out.printf("Enter an integer: ");
		num = input.nextInt();
		
		//if the number is even, the remainder will be zero
		if (num % 2 <= 0)
		{
			System.out.printf("The number is even");
		}
		else
		{
			System.out.printf("The number is odd");
		}
		
	}

}
