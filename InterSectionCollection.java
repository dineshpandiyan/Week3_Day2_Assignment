package week3.day2.assignments.completed;

import java.util.Set;
import java.util.TreeSet;

/*
 /*
  * Pseudo Code
  * a) Declare An array for {3,2,11,4,6,7};	 
  * b) Declare another array for {1,2,8,4,9,7};
  * c) Declare for loop iterator from 0 to array length
  * d) Declare a nested for another array from 0 to array length
  * e) Compare Both the arrays using a condition statement
  * f) Print the first array (shoud match item in both arrays)
  */
 
public class InterSectionCollection {

	public static void main(String[] args) {
		
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		Set<Integer> s1 = new TreeSet<Integer>();
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				s1.add(arr1[i]);
				s1.add(arr2[j]);				
				
			}			
			
			
		}
		
		System.out.println(s1);

	}

}
