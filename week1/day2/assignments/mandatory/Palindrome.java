package week1.day2.assignments.mandatory;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pal="madam";
		String rev="";
		int k=pal.length();
		//System.out.println(k);
		for(int i=k-1;i>=0;i--) {
			rev=rev+pal.charAt(i);
		}
		System.out.println(rev);

		if(rev==pal)
		{System.out.println("Its palindrome");		
		}
		else
			System.out.println("Not palindrome");


	}
}
