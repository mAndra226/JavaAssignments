package arithmetic;

import java.util.Scanner; //used for input from console

public class arithmeticSmallestandLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		int sum;
		int average;
		int product;
		int smallNum;
		int bigNum;
		 
		//prompts user
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();
		
		//calculations
		product = num1 * num2 * num3;
		sum = num1 + num2 + num3;
		average = (num1 + num2 + num3)/3;
		
		//output the smallest and largest of the number
		smallNum = num1;
		bigNum = num1;
		
		if (num2 < smallNum)
		{
			smallNum = num2;
		}
		else if (num3 < smallNum)
		{
			smallNum = num3;
		}
		
		if (num2 > bigNum)
		{
			bigNum = num2;
		}
		else if (num3 > bigNum)
		{
			bigNum = num3;
		}
		
		//Print the results
		System.out.printf("The sum is %d%n", sum);
		System.out.printf("The product is %d%n", product);
		System.out.printf("The average is %d%n", average);
		
		//Print the smallest and largest of the values
		System.out.printf("Smallest value is %d\n", smallNum);
		System.out.printf("Largest value is %d\n", bigNum);
	}

}
