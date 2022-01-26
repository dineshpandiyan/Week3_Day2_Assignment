package week3.day2.assignments.completed;


/* Reverse Even Words :
 * 
 * Build a logic to reverse the even position words (output: I ma a erawtfos tester)
 * 
 * Pseudo Code:
 * Declare the input as Follow : String test = "I am a software tester"; 
 * a) split the words and have it in an array
 * b) Traverse through each word (using loop)
 * c) find the odd index within the loop (use mod operator)
 * d) split the words and have it in an array
 * e) print the even position words in reverse order using another loop (nested loop)
 * f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
 */
 
public class ReverseEvenWords {

	public static void main(String[] args) {

		// Declare the input
		String str = "I am a software tester";
		//System.out.println(str);
		
				
		// split the words and have it in an array
		String[] s1 = str.split(" ");
		int len = s1.length;
		//System.out.println(len); // 5
		//System.out.println(Arrays.toString(s1)); // [I, am, a, software, tester]
		
		// Traverse through each word (using loop)		
		for(int i=0; i<len; i++) {
			
			//find the odd index within the loop (use mod operator)
			if(i % 2 != 0) {
				
				// split the words and have it in an array
				char[] ch1 = s1[i].toCharArray();
				//System.out.println(ch1);
				
				// print the even position words in reverse order using another loop (nested loop)
				for(int j=ch1.length-1; j >= 0; j--) {
					
					System.out.println(ch1[j]);					
					
				}
				
				System.out.println("**************");
				
				
			}
			
			
		}

	}

}
