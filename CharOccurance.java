package week3.day2.assignments.completed;

/* Character Occurrence :
 * Check number of occurrences of a char (eg 'e') in a String :
 * 
 * String str = "welcome to chennai";
 * declare and initialize a variable count to store the number of occurrences
 * convert the string into char array
 * get the length of the array
 * traverse from 0 till the array length 
 * Check the char array has the particular char in it 
 * if is has increment the count				
 * print the count out of the loop
 * 
 */
			

public class CharOccurance {

	public static void main(String[] args) {

		// Declare String str = "welcome to chennai";
		String str = "welcome to chennai";
		
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		
		// convert the string into char array
		char[] c1 = str.toCharArray();
		System.out.println(c1); // welcome to chennai
		
		// get the length of the array
		int len = str.length();
		//System.out.println(len); // 18
		
		// traverse from 0 till the array length 
		for(int i=0; i<=len-1; i++) {
			
			if(str.charAt(i)=='e') {
				
				count++;
				
			}			
			
			
		}
		
		// print the count out of the loop
		System.out.println("The e char occurance is = " + count);

	}

}
