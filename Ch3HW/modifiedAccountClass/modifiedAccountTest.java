package modifiedAccountClass;

import java.util.Scanner;

public class modifiedAccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		modifiedAccountClassPackage account1 = new modifiedAccountClassPackage("John Green", 50.00);
		modifiedAccountClassPackage account2 = new modifiedAccountClassPackage("John Blue", -7.53);
		
		
		//display initial balance of each object
		System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		//account1 prompt
		System.out.print("Enter deposit amount for account1: "); //prompt user
		double depositAmount = input.nextDouble(); //record user input
		System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); //add to account1's balance
		
		//display balances
		System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());

		//account2 prompt
		System.out.print("Enter deposit amount for account2: "); //prompt user
		depositAmount = input.nextDouble(); //record user input
		System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount); //add to account2's balance
		
		//display balances
		System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		// - - - Withdraw Section - - - //
		
		//withdraw account1 prompt
		System.out.print("Enter withdraw amount for account1: "); //prompt user
		double withdrawQuantity = input.nextDouble(); //record user input
		System.out.printf("Removing $%.2f from account1 balance%n%n", withdrawQuantity);
		account1.withdraw(withdrawQuantity); //remove from account1's balance
		
		//display balances after withdraw
		System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		//withdraw account2 prompt
		System.out.print("Enter withdraw amount for account2: "); //prompt user
		withdrawQuantity = input.nextDouble(); //record user input
		System.out.printf("Removing $%.2f from account2 balance%n%n", withdrawQuantity);
		account2.withdraw(withdrawQuantity); //remove from account2's balance
		
		//display balances after withdraw
		System.out.printf("%s's balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s's balance: $%.2f%n", account2.getName(), account2.getBalance());
	}
}
