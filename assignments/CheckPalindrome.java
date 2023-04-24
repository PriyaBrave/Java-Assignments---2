//Week 1 - Day 2 - Assignment 2

package week1.day2.assignments;

public class CheckPalindrome {

	public static void main(String[] args) {
		int num = 34343,rem, rev = 0, temp;
		
		temp = num;
		while(num > 0) {
			rem = num % 10;
			rev = (rev * 10)+rem;
			num = num/10;
		}
		if(temp == rev) {
			System.out.println("Given number is Palindrome..");
		} else {
			System.out.println("Given number is not a Palindrome..");
		}

	}

}
