package week1.day2.assignments.mandatory;

public class FindIntersection {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 *  f) Print the first array (should match item in both arrays)
	 */
 public static void main(String[] args) {
	

	//a) Declare An array for {3,2,11,4,6,7}
	int[] arr = {3,2,11,4,6,7};
	
	//b) Declare another array for {1,2,8,4,9,7}
	int[] arry= {1,2,8,4,9,7};
	//c) Declare for loop iterator from 0 to array length
	for(int i=0;i<arr.length;i++) {
		//d) Declare a nested for another array from 0 to array length
		for(int j=0;j<arry.length;j++) {
			//e) Compare Both the arrays using a condition statement
			if(arr[i]==arry[j]) {
				//f) Print the first array (should match item in both arrays)
				System.out.println(arr[i]);
			}
		}
	}

 }
	
}
