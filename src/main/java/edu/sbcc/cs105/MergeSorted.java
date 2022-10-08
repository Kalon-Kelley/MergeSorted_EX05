/**
 * CS 105 Theory & Practice
 * CRN: 62498
 * Assignment: MergeSorted
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Lucas Kelley
 */
package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * This code is a solution for the MergeSorted assignment.
 *
 */
public class MergeSorted {
// Creating an array list
	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
		int i = 0;
		ArrayList<Integer> c = new ArrayList<>();
		while (i <= a.size()-1 && i <= b.size()-1){
			c.add(a.get(i));
			c.add(b.get(i));
			i++;
		}
		if(i <= b.size()-1){
			while (i <= b.size()-1){
				c.add(b.get(i));
				i++;
			}
		}
		else if (i <= a.size()-1){
			while (i<= a.size()-1){
				c.add(a.get(i));
				i++;
			}
		}
		//sorts the array
		Collections.sort(c);
		return c;
	}
	public static void main(String args[]) {
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 5, 7));
		ArrayList<Integer> y = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 8));

		ArrayList<Integer> sorted = mergeSorted(y, x);
		for (int val : sorted) {
			System.out.print(val + " ");
		}
		System.out.println();

		// you can put more code here to do more testing
	}
}
