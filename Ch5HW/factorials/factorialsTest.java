package factorials;

public class factorialsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorial = 1;
		
		System.out.println("x     factorial");
		
		for(int i = 1; i <= 20; i++) {
			factorial = (factorial * i);
			
			System.out.printf("%s! is %d%n", i , factorial);
		}
	}
}
