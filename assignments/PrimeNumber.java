//Week 1 - Day 2 - Assignment 1

package week1.day2.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13, i;
		boolean flag = false;
		
		//Checking whether Prime or Not
		if (input == 0 || input == 1) {
			System.out.println(input + " is not a Prime Number..");
		} else {
			for (i = 2; i <= input / 2; i++) {
				if (input % i == 0) {
					flag = true;
					System.out.println(input + " is not a Prime Number..");
					break;
				}
			}
			if(flag == false) {
				System.out.println(input+" is a Prime Number..");
			}
		}
	}
}
