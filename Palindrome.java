package week3.day2.assignments.completed;

/* Palindrome :
 * 
 * Pseudo Code :
 * a) Declare A String value as"madam" 
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */

public class Palindrome {

	public static void main(String[] args) {

		// Declare A String value as"madam"		
		String str1 = "madam";
		//System.out.println(str1); //madam >> [0,1,2,3,4]
		
		// Declare another String rev value as ""
		String str2 = "";
		//System.out.println(str2);
		
		// Array Length
		int len = str1.length();
		//System.out.println(len); //5
		
		// Iterate over the String in reverse order
		for(int i=len-1; i>=0; i--) {			
			
			str2 = str2 + str1.charAt(i);			
			
		}
		
		System.out.println("Reversed str1 & added it into str2 : " + str2);
		
		boolean eql = str1.equalsIgnoreCase(str2);
		
		if(eql) {
			
			System.out.println(str2 + " is Palindrome");
			
		}else {
			
			System.out.println(str2 + " is not Palindrome");
			
		}
		

	}

}
