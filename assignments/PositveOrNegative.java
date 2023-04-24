//Week 1 - Day 2 - Assignment 4

package week1.day2.assignments;

public class PositveOrNegative {

	public static void main(String[] args) {
		int input = 11;
		
		// Checking a Number is Positive or Negative or Neutral(i.e., 0)
		if(input > 0) {
			System.out.println(input+ " is a Positive Value..");
		} else if (input < 0) {
			System.out.println(input+ " is a Negative Value..");
		} else {
			System.out.println(input+ " is a Neutral Value..");
		}
	}

}