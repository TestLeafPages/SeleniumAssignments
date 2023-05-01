package week1.day2.assignments.mandatory;


	
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="changeme";
		char[] chngeChar= original.toCharArray();
		for(int i=0;i<chngeChar.length;i++) {
			//System.out.print(chngeChar[i]);
			
			if(i%2!=0) {
				char ch=original.charAt(i);
				System.out.println(Character.toUpperCase(ch));
			}
				else {
				System.out.println(chngeChar[i]);
			}
			
		}

	}

}
