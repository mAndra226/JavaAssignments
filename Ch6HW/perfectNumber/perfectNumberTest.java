package perfectNumber;

public class perfectNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The perfect numbers between 1 and 1,000 are: "); //title
		
		//integrate from 1 to 1000
		for (int i = 1; i < 1000; i++) {
			if(isPerfect(i)) {
				System.out.printf("%d ", i); //output perfect numbers
			}
		}
	}
	
	public static boolean isPerfect(int x) {
		int sum = 0;
		
		//look at every number and divide it by i.
		for (int i = 1; i < x; i++) {
			if((x % i) == 0) {
				sum += i; //set value of sum to i
			}
		}
		
		//if the value of sum is equal to the value of x, then return true, else, return false
		if (sum == x) {
			return true;
		}else {
			return false;
		}
	}

}
