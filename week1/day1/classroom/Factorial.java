package week1.day1.classroom;

public class Factorial {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {

		{
		int num=5,fact=1,i=1;
		
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+num+ " is: "+fact);
	}

		// Print factorial (fact)
	
	}

}
