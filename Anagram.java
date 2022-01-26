package week3.day2.assignments.completed;

import java.util.Arrays;

/* Anagram :
 * 
 * Pseudo Code :
 * Declare a String : String text1 = "stops";
 * Declare another String : String text2 = "potss";
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */

public class Anagram {

	public static void main(String[] args) {
		
		// Declare a String
		String str1 = "stops";
		//System.out.println(str1);
		
		// Declare another String
		String str2 = "potss";
		//System.out.println(str2);
		
		// Check length of the strings are same then(Use Condition)
		int len1 = str1.length();
		//System.out.println(len1);
		
		int len2 = str2.length();
		//System.out.println(len2);
		
		if(len1==len2) {
			
			System.out.println("Both length are same");
			
		}else {
			
			System.out.println("Both the length are not same");
			
		}
		
		// Convert both Strings in to characters
		char[] ch1 = str1.toCharArray();
		//System.out.println(ch1);
		
		char[] ch2 = str2.toCharArray();
		//System.out.println(ch2);
		
		// Sort Both the arrays		
		Arrays.sort(ch1); // stops >> opsst
		Arrays.sort(ch2); // potss >> opsst
		
		// Check both the arrays has same value
		boolean eql = Arrays.equals(ch1, ch2);
		//System.out.println(eql);
		
		if(eql) {
			
			System.out.println("Both the arrays has same value");
			
		}else {
			
			System.out.println("Both the arrays has not same value");
			
		}

	}

}
