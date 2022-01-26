package week3.day2.assignments.completed;

/* Find Types :
 * Here is the input String test = "$$ Welcome to 2nd Class of Automation $$ ";
 * Here is what the count you need to find
   int  letter = 0, space = 0, num = 0, specialChar = 0;
 * Build the logic to find the count of each
 * Pseudo Code:
 * a)  Convert the String to character array
 * b)  Traverse through each character (using loop)
 * c)  Find if the given character is what type using (if)
 * i)  Character.isLetter
 * ii) Character.isDigit
 * iii)Character.isSpaceChar
 * iv) else -> consider as special character
 * 
 * Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
 *
 */
		
public class FindTypes {

	public static void main(String[] args) {
		
		// Input
		String str = "$$ Welcome to 2nd Class of Automation $$ ";
		
		// Count you need to find initializing
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		// Convert the String to character array
		char[] ch1 = str.toCharArray();
		//System.out.println(ch1); // $$ Welcome to 2nd Class of Automation $$
		
		int len = str.length();
		//System.out.println(len); // 41
		
		// Traverse through each character (using loop)
		
		for(int i=0; i<=len-1; i++) {
			
			
			if(Character.isLetter(ch1[i])) {
				
				letter++;				
				
			}
			else if(Character.isDigit(ch1[i])){
				
				num++;
				
			}
			else if(Character.isSpaceChar(ch1[i])) {
				
				space++;
				
			}
			else {
				
				specialChar++;
				
			}
			
		}
		
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("space: " + space);		
		System.out.println("specialCharcter: " + specialChar);

	}

}
