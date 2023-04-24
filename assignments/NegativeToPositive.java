//Week 1 - Day 2 - Assignment 3

package week1.day2.assignments;

public class NegativeToPositive {

	public static void main(String[] args) {
		
		int negnum = -45, posnum;
		// Converting Negative Number to Positive Number
		if(negnum < 0) {
			posnum = 0 - (negnum);
			System.out.println("Positive Value of "+negnum+" is "+posnum);
		}
	}

}
