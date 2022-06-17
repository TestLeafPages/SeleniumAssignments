package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		// Print first number
		
		// Iterate from 1 to the range
		
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number
		
		// print sum
        int range = 8;
	int firstNum = 0;
	int secNum = 1;
	int sum;
	System.out.println(firstNum);
	for(int i = 0;i<range-3;i++) {
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum = sum;	
		System.out.println(sum);

	}

}
