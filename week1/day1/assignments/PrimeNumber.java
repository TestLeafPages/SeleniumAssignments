package week1.day1.assignments;



public class PrimeNumber {
	
	public static void main(String[] args) {
		Prime(7);
	}
	
	public static void Prime(int n ) {
		boolean res= true;
		for (int i=2;i<n/2;i++) {
			if(n%i==0) {
				res=false;
				System.out.println("number is not Prime");
				break;
			}
			
		}
		if(res==true)
		System.out.println("Prime Number");
		
	}

}
