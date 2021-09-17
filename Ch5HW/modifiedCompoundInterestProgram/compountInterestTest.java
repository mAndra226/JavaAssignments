package modifiedCompoundInterestProgram;

public class compountInterestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 0; // amount on deposit at end of each year
	    double principal = 1000.0; // initial amount before interest
	 
	    // display headers
	    System.out.printf("%s%20s\n", "Year", "Amount on deposit");
	 
	    //calculate amount on deposit for each of ten years
	    for(int year = 1; year <= 10; year++) {
	    	
	    	//increment interest rate by 1% from 5% t0 10%
	    	for(double rate2 = 0.05; rate2 <= 0.10; rate2 += 0.01) {
	    		//calculate new amount on deposit for each of then years	
	    		 amount = principal * Math.pow( 1.0 + rate2, year);
	    		 
	    		// display the year and the amount
	 	        System.out.printf("%4d%,20.2f\n", year, amount);
	        }
	    }
	}
}