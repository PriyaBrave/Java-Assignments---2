//Week 1 - Day 2 - Assignment 5 - Array - 1

//Find the Second smallest number in the array {23,45,67,32,89,22 }

package week1.day2.assignments;

import java.util.Arrays;

public class ArraySecondLargestElement {

	public static void main(String[] args) {
		int values[] = { 23, 45, 67, 32, 89, 22 };

		// Original Array Elements
		System.out.println("Original Array: ");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}

		System.out.println("\n");
		// Sorting the Array Elements
		Arrays.sort(values);

		// Sorted Array
		System.out.println("Sorted Array: ");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}

		// Printing the Second Smallest Number in the Array
		System.out.println("\n\nThe Second Smallest Number in the Array is " + values[1]);
	}

}
