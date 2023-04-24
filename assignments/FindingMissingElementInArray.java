package week1.day2.assignments;

import java.util.Arrays;

public class FindingMissingElementInArray {

	public static void main(String[] args) {
		
		//Input Values
		int arr[] = {1,2,3,4,5,6,8};
		
		//Sorting Array
		Arrays.sort(arr);
		
		// Printing the Missing Elements
		System.out.println("Missing Element is: ");
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] != i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
