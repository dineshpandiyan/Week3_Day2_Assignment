package week3.day2.assignments.completed;

import java.util.LinkedHashSet;
import java.util.Set;

/* Remove Duplicates :
 * Pseudo code 
 * a) Use the declared String text as input
	  String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 * g) Displaying the String without duplicate words	
 */

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> s1 = new LinkedHashSet<String>();
		//System.out.println(s1);
		
		for (String str : split) {
			
			s1.add(str);
						
		}
		
		System.out.println(s1);
	}

}
