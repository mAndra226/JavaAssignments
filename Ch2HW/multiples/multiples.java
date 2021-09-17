package multiples;

import java.util.Scanner;

public class multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.printf("Enter the second number: ");
		num2 = input.nextInt();
		
		if((num1 % num2) == 0)
		{
			System.out.printf("%d is a multiple of %d", num1, num2);
		} 
		else
		{
			System.out.printf("%d is not a multiple of %d", num1, num2);
		}

	}
}
