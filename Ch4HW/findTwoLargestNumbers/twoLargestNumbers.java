package findTwoLargestNumbers;

import java.util.Scanner;

public class twoLargestNumbers {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      
        int number;
        int count = 1;
        int largest = 0;
        int secLargest = 0;
         
        while (count <= 5) {
            System.out.printf("Insert a number %d: ", count);
            number = input.nextInt();
            
                if (number > largest) {
                    secLargest = largest;
                    largest = number;
                } else if(number > secLargest) {
                	secLargest = number;
                } else {
                	//alert user to not enter the same number twice
                	 System.out.printf("Do not enter the same numbers twice . . .%n"); 
                }
                
                count++; //increment by one
        }
         
        System.out.printf("The two largest number in your list are: %d & %d\n", largest, secLargest);
    }

}
