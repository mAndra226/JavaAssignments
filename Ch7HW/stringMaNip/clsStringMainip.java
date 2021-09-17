package stringMaNip;

import java.lang.reflect.Array;

public class clsStringMainip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] strArray1 = new String [][] { {"H", "e", "l", "l", "o"}, {"W", "o", "r", "l", "d"} };
		String printString = "";
		
		String[][] strArray2 = new String[][] { {"H", "W"}, {"e", "o"}, {"l", "r"}, {"l", "l"}, {"o", "d"} };
		String printString2 = "";
		
		String[][] strArray3 = new String[][] { {"o", "l", "l", "e", "H"}, {"d", "l", "r", "o", "W"} };
		String printString3 = "";
		
		String[][] strArray4 = new String[][] { {"W", "H"}, {"o", "e"}, {"r", "l"}, {"l", "l"}, {"d", "o"} };
		String printString4 = "";
		
		
		//printString = arrManip1(strArray1);
		//System.out.println(printString);
		
		//printString2 = arrManip2(strArray2);
		//System.out.println(printString2);
		
		//printString3 = arrManip3(strArray3);
		//System.out.println(printString3);
		
		printString4 = arrManip4(strArray4);
		System.out.println(printString4);
		
	} //end main
	
	private static String arrManip1(String[][] strArr) {
		String strCon = "";
		
		for(int i = 0; i < strArr.length; i++) { //this outer-loop will iterate through the rows (i reps. # of rows, length of array is # of rows)
			
			for(int j = 0; j < strArr[i].length; j++) { //this inner-loop will iterate though the columns (j reps. # of columns)
				strCon += strArr[i][j];
			}
			
			strCon += " "; //adds space between the two words
		}
		
		return strCon;
	}
	
	private static String arrManip2(String[][] strArr) {
		String strCon = "";
		
		for(int col = 0; col < strArr[0].length; col++) {
			
			for(int row = 0; row < strArr.length; row++) {
				strCon += strArr[row][col];
			}
			strCon += " ";
		}
		
		
		return strCon;
	}
	
	private static String arrManip3(String[][] strArr) {
		String strCon = "";
		
		for(int i = 0; i < strArr.length; i++) { //this outer-loop will iterate through the rows (i reps. # of rows, length of array is # of rows)	
			for(int j = strArr[i].length -1; j >= 0; j--) { //this inner-loop will iterate though the columns (j reps. # of columns)
				strCon += strArr[i][j];
			}
			
			strCon += " "; //adds space between the two words
		}
		
		return strCon;
	}
	
	private static String arrManip4(String[][] strArr) {
		String strCon = "";
		
		for(int col = strArr[0].length - 1; col >= 0; col--) {
			
			for(int row = 0; row < strArr.length; row++) {
				strCon += strArr[row][col];
			}
			strCon += " ";
		}
		
		return strCon;
	}

}
