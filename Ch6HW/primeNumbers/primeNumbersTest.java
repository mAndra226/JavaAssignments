package primeNumbers;

public class primeNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The prime numbers between 1 and 10,000 are: ");
		
		for(int i = 1; i < 10000; i++) { //integrate from 1 to 10,000
			if(isPrime(i)) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	public static boolean isPrime(int x) {
		if(x <= 1) { //if the number is less than or equal to 1, return false
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if ((x % i) == 0) { //if remainder is 0, return false
				return false;
			}
		}
		
		return true;
	}

}
