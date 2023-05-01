package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int input = 153;
		int orginal = input; 
		int calculated = 0;
		int remainder;
		
		
		while (input > 0) {
			
			remainder = input % 10;
			input = input/10;
			calculated = calculated + (remainder * remainder* remainder);
			
		
		}
		
		if (orginal == calculated) {
			System.out.println("This is a Armstrong Number");
			
		}
	
		else {
			System.out.println("This is not a Armstrong Number");
		}
		

	}

}

		



		

		

		

		



	}



}
