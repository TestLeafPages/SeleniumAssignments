package week1.day1;


public class Fibonacciseries {



	public static void main(String[] args) {

		int Firstnumber=0;
		int secondnumber = 1;		
		int range=8;
		int sum=0;

		System.out.println(Firstnumber);
		
		for (Firstnumber = 1; Firstnumber <=range; Firstnumber++) {	
			
			Firstnumber=secondnumber;

			secondnumber=sum;

			sum=Firstnumber+secondnumber;			

			System.out.println(sum);

		}

	}

}




