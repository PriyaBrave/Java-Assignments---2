package week1.day2.assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int terms = 8, firstNum = 0, secNum = 1, sum;
		
		System.out.println("Fibonacci Series \n ***********\n");
		System.out.println("No. of Terms: "+terms);
		
		// Generating Fibonacci Series
		System.out.println(firstNum);
		
		for(int i = 1; i <= terms;i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}
