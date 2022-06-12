package week1.day1.assignments;
public class FibonacciSeries {
	public static void main(String[] args) {
		Fibonacci(8);
	}

	
	public static void Fibonacci(int n ) {
		int firstNum =0;
		int secondNum =1;
		int sum;
		System.out.print(firstNum +","+ secondNum);
		for (int i=2;i<n;i++) {
			
			sum=firstNum+secondNum;
			System.out.print(" ,"+sum);
			firstNum=secondNum;
			secondNum=sum;
		}
	}
}


